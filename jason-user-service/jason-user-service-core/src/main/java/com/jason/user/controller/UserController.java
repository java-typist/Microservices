package com.jason.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jason.common.model.Constant;
import com.jason.common.model.Response;
import com.jason.common.utils.RedisUtil;
import com.jason.user.model.Manage;
import com.jason.user.model.Role;
import com.jason.user.model.User;
import com.jason.user.service.UserService;
import com.jason.user.utils.TokenUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @Author Jason
 * @CreateTime 2019/8/20 15:42
 * @Modify 2019/8/20 15:42
 * @Version 1.0
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 详细的user数据
     *
     * @param userId
     * @return
     */
    @GetMapping(value = "/user")
    public Response getUser(@RequestParam(value = "userId") Integer userId) {
        System.out.println(userId);
        Response response = new Response();
        User user = userService.getUser(userId);
        if (user == null) {
            response.error(Constant.REQUEST_FAILURE, "用户不存在");
        } else {
            response.success(Constant.REQUEST_SUCCESS, "操作成功", user);
        }
        return response;
    }

    /**
     * user数据更新
     *
     * @param user
     * @return
     */
    @PutMapping(value = "/user/update")
    public Response update(@RequestBody User user) {
        Response response = new Response();
        if (userService.updateMsg(user) > 0) {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("username", user.getUsername());
            user = userService.getOne(queryWrapper);
            response.success(Constant.REQUEST_SUCCESS, "操作成功", user);
        } else {
            response.error(Constant.REQUEST_FAILURE, "操作失败");
        }
        return response;
    }

    /**
     * 不携带id属性
     *
     * @param username
     * @return
     */
    @GetMapping(value = "/user/msg/{username}")
    public Response getUser(@PathVariable(value = "username") String username) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Enumeration<String> headers = request.getHeaderNames();
        while (headers.hasMoreElements()) {
            String header = headers.nextElement();
            System.out.println(header + ":" + request.getHeader(header));
        }
        Response response = new Response();
        System.out.println(username);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username", username);
        userQueryWrapper.ne("status", Constant.USER_UNAVAILABLE);
        User user = userService.getOne(userQueryWrapper);
        if (user == null) {
            response.error(Constant.REQUEST_FAILURE, "用户不存在");
        } else {
            response.success(Constant.REQUEST_SUCCESS, "操作成功", user);
        }
        return response;
    }

    /**
     * 用户账户状态
     *
     * @param user
     * @return
     */
    @PutMapping(value = "/user/status")
    public Response status(@RequestBody User user) {
        Response response = new Response();
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("username", user.getUsername());
        updateWrapper.ne("status", Constant.USER_UNAVAILABLE);
        updateWrapper.set("status", user.getStatus());
        if (userService.update(updateWrapper)) {
            if (user.getStatus().equals(Constant.USER_UNAVAILABLE)) {
                String token = RedisUtil.get(user.getUsername());
                RedisUtil.remove(token);
                RedisUtil.remove(user.getUsername());
            } else {
                QueryWrapper<User> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("username", user.getUsername());
                user = userService.getOne(queryWrapper);
                TokenUtil.flushToken(user);
            }
            response.success(Constant.REQUEST_SUCCESS, "操作成功", null);
        } else {
            response.error(Constant.REQUEST_FAILURE, "操作失败");
        }
        return response;
    }

    @GetMapping(value = "/role")
    public Response getRole(@RequestParam(value = "name") String name) {
        Role role = userService.getRole(name);
        Response response = new Response();
        if (role == null) {
            response.error(Constant.REQUEST_FAILURE, "无此角色");
        } else {
            response.success(Constant.REQUEST_SUCCESS, "操作成功", role);
        }
        return response;
    }

    @PostMapping(value = "/role/add")
    public Response addRole(@RequestBody Role role) {
        Response response = new Response();
//        if(userService.addRole())
        return response;
    }

    @PostMapping(value = "/manage")
    public Response getManage(@RequestBody Manage manage) {
        Response response = new Response();
        if (userService.addManage(manage).equals(Constant.MAPPER_SUCCESS)) {
            response.success(Constant.REQUEST_SUCCESS, "操作成功", manage);
        } else {
            response.error(Constant.REQUEST_FAILURE, "操作失败");
        }
        return response;
    }

    @DeleteMapping(value = "/manage/{id}")
    public Response remove(@PathVariable(value = "id") Integer id) {
        Response response = new Response();
        if (userService.removeManage(id) > 0) {
            response.success(Constant.REQUEST_SUCCESS, "操作成功", null);
        } else {
            response.error(Constant.REQUEST_FAILURE, "操作失败");
        }
        return response;
    }

}
