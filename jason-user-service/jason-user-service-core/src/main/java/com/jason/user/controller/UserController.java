package com.jason.user.controller;

import com.jason.common.model.Constant;
import com.jason.common.model.Response;
import com.jason.common.utils.RedisUtil;
import com.jason.user.dto.role.RoleDTO;
import com.jason.user.dto.user.UserDetailDTO;
import com.jason.user.dto.user.UserSimpleDTO;
import com.jason.user.dto.user.UserUpdateDTO;
import com.jason.user.service.UserService;
import com.jason.user.utils.ConvertUtil;
import com.jason.user.utils.TokenUtil;
import com.jason.user.vo.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
        UserDetailDTO user = userService.getUser(userId);
        if (user == null) {
            response.error(Constant.REQUEST_FAILURE, "用户不存在");
        } else {
            UserDetailVO detailVO = ConvertUtil.convertDetail(user);
            response.success(Constant.REQUEST_SUCCESS, "操作成功", detailVO);
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
    public Response update(@RequestBody UserUpdateVO user) {
        Response response = new Response();
        UserUpdateDTO updateDTO = ConvertUtil.convertUpdate(user);
        if (userService.updateMsg(updateDTO) > 0) {
            UserSimpleDTO user1 = userService.getUser(user.getUsername());
            UserSimpleVO simpleVO = ConvertUtil.convertSimple(user1);
            response.success(Constant.REQUEST_SUCCESS, "操作成功", simpleVO);
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
        Response response = new Response();
        UserSimpleDTO user = userService.getUser(username);
        System.out.println(user);
        if (user == null) {
            response.error(Constant.REQUEST_FAILURE, "用户不存在");
        } else {
            UserSimpleVO vo = ConvertUtil.convertSimple(user);
            response.success(Constant.REQUEST_SUCCESS, "操作成功", vo);
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
    public Response status(@RequestBody UserUpdateVO user) {
        Response response = new Response();
        if (userService.updateUser(ConvertUtil.convertUpdate(user)) > 0) {
            UserSimpleDTO simple = userService.getUser(user.getUsername());
            TokenUtil.flushToken(simple);
            response.success(Constant.REQUEST_SUCCESS, "操作成功", null);
        } else {
            String token = RedisUtil.get(user.getUsername());
            RedisUtil.remove(token);
            RedisUtil.remove(user.getUsername());
            response.error(Constant.REQUEST_FAILURE, "操作失败");
        }
        return response;
    }

    @GetMapping(value = "/role")
    public Response getRole(@RequestParam(value = "name") String name) {
        RoleDTO role = userService.getRole(name);
        Response response = new Response();
        if (role == null) {
            response.error(Constant.REQUEST_FAILURE, "无此角色");
        } else {
            response.success(Constant.REQUEST_SUCCESS, "操作成功", role);
        }
        return response;
    }

    @PostMapping(value = "/role/add")
    public Response addRole(@RequestBody RoleVO role) {
        Response response = new Response();
//        if(userService.addRole())
        return response;
    }

    @PostMapping(value = "/manage")
    public Response getManage(@RequestBody ManageVO manage) {
        Response response = new Response();
        if (userService.addManage(ConvertUtil.convertManage(manage)).equals(Constant.MAPPER_SUCCESS)) {
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
