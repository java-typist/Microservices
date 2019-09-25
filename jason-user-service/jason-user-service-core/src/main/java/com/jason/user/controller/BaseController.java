package com.jason.user.controller;

import com.jason.common.model.Constant;
import com.jason.common.model.Response;
import com.jason.common.utils.DataUtil;
import com.jason.user.UserServiceAPP;
import com.jason.user.dto.role.RoleDTO;
import com.jason.user.dto.user.UserSimpleDTO;
import com.jason.user.service.UserService;
import com.jason.user.utils.ConvertUtil;
import com.jason.user.utils.TokenUtil;
import com.jason.user.vo.LoginVO;
import com.jason.user.vo.UserAddVO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Author Jason
 * @CreateTime 2019/8/20 11:41
 * @Modify 2019/8/20 11:41
 * @Version 1.0
 */
@RestController
@EnableBinding(Sink.class)
public class BaseController {

    @Resource
    private UserService userService;

    private static Log logger = LogFactory.getLog(UserServiceAPP.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object object) {
        logger.info("receive:" + object);
    }

    /**
     * 普通用户注册
     *
     * @param user
     * @return
     */
    @PostMapping(value = "/register")
    public Response register(@RequestBody UserAddVO user) {
        Response response = new Response();

        if (userService.getUser(user.getUsername()) != null) {
            response.error(Constant.REQUEST_FAILURE, "用户名不可用");
        } else {
            RoleDTO role = userService.getRole("user");
            user.setRoleIds(new ArrayList<>());
            user.getRoleIds().add(role.getId());
            if (userService.addUser(ConvertUtil.convertAdd(user)).equals(Constant.MAPPER_SUCCESS)) {
                response.success(Constant.REQUEST_SUCCESS, "操作成功", user);
            } else {
                response.error(Constant.REQUEST_FAILURE, "操作失败");
            }
        }
        return response;
    }

    @PostMapping(value = "/login")
    public Response login(@RequestBody LoginVO user) {
        Response response = new Response();
        UserSimpleDTO check = userService.getUser(user.getUsername());
        if (check == null) {
            response.error(Constant.REQUEST_FAILURE, "用户不存在");
        } else if (userService.getUser(user.getUsername()) != null) {
            String token = DataUtil.MD5("" + check.getId() + new Date().getTime());      //todo
            TokenUtil.addToken(token, check);
            response.success(Constant.REQUEST_SUCCESS, "登录成功", token);
        } else {
            response.error(Constant.REQUEST_FAILURE, "密码不匹配");
        }
        return response;
    }

    /**
     * 负载均衡健康检查接口
     *
     * @return
     */
    @RequestMapping(value = "/health")
    public String health() {
        return "ok";
    }

}
