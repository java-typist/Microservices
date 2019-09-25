package com.jason.user.api;

import com.jason.common.model.Response;
import com.jason.user.fallback.UserServiceFallbackFactory;
import com.jason.user.logger.UserFeignLogConfig;
import com.jason.user.vo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "user-service", fallbackFactory = UserServiceFallbackFactory.class, configuration = UserFeignLogConfig.class)
public interface UserAPI {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    Response login(@RequestBody LoginVO user);

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    Response register(@RequestBody UserAddVO user);

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    Response getUser(@RequestParam(value = "userId") Integer userId);

    @RequestMapping(value = "/user/update", method = RequestMethod.PUT)
    Response update(@RequestBody UserUpdateVO user);

    @RequestMapping(value = "/user/msg/{username}", method = RequestMethod.GET)
    Response getUser(@PathVariable(value = "username") String username);

    @RequestMapping(value = "/user/status", method = RequestMethod.PUT)
    Response status(@RequestBody UserUpdateVO user);

    @RequestMapping(value = "/role", method = RequestMethod.GET)
    Response getRole(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/role/add", method = RequestMethod.POST)
    Response addRole(@RequestBody RoleVO role);

    @RequestMapping(value = "/manage", method = RequestMethod.POST)
    Response getManage(@RequestBody ManageVO manage);

    @RequestMapping(value = "/manage/{id}", method = RequestMethod.DELETE)
    Response remove(@PathVariable(value = "id")Integer id);

}
