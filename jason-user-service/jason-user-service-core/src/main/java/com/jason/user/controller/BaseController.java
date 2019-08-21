package com.jason.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jason.common.model.Constant;
import com.jason.common.model.Response;
import com.jason.common.utils.DataUtil;
import com.jason.user.model.Role;
import com.jason.user.model.User;
import com.jason.user.service.UserService;
import com.jason.user.utils.TokenUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashSet;

/**
 * @Author Jason
 * @CreateTime 2019/8/20 11:41
 * @Modify 2019/8/20 11:41
 * @Version 1.0
 */
@RestController
public class BaseController {

    @Resource
    private UserService userService;

    @PostMapping(value = "/register")
    public Response register(@RequestBody User user) {
        Response response = new Response();

        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        userWrapper.eq("username", user.getUsername());
        if (userService.getOne(userWrapper) != null) {
            response.error(Constant.REQUEST_FAILURE, "用户名不可用");
        } else {
            Role role = userService.getRole("user");
            user.setRoles(new HashSet<>());
            user.getRoles().add(role);
            if (userService.addUser(user).equals(Constant.MAPPER_SUCCESS)) {
                response.success(Constant.REQUEST_SUCCESS, "操作成功", user);
            } else {
                response.error(Constant.REQUEST_FAILURE, "操作失败");
            }
        }
        return response;
    }

    @PostMapping(value = "/login")
    public Response login(@RequestBody User user) {
        Response response = new Response();
        QueryWrapper<User> userWrapper = new QueryWrapper<>();
        userWrapper.eq("username", user.getUsername());
        User check = userService.getOne(userWrapper);
        if (check == null) {
            response.error(Constant.REQUEST_FAILURE, "用户不存在");
        } else if (check.getPassword().equals(user.getPassword())) {
            String token = DataUtil.MD5(check.getId() + user.getUsername());      //todo
            TokenUtil.addToken(token, check);
            response.success(Constant.REQUEST_SUCCESS, "登录成功", token);
        } else {
            response.error(Constant.REQUEST_FAILURE, "密码不匹配");
        }
        return response;
    }

}
