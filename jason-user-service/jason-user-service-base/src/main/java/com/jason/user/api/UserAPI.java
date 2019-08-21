package com.jason.user.api;

import com.jason.common.model.Response;
import com.jason.user.model.Manage;
import com.jason.user.model.Role;
import com.jason.user.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


/**
 * @Author Jason
 * @CreateTime 2019/8/21 14:06
 * @Modify 2019/8/21 14:06
 * @Version 1.0
 */
@FeignClient(value = "jason-user-service")
public interface UserAPI {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    Response login(@RequestBody User user);

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    Response register(@RequestBody User user);

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    Response getUser(@RequestParam(value = "userId") Integer userId);

    @RequestMapping(value = "/user/update", method = RequestMethod.PUT)
    Response update(@RequestBody User user);

    @RequestMapping(value = "/user/msg/{username}", method = RequestMethod.GET)
    Response getUser(@PathVariable(value = "username") String username);

    @RequestMapping(value = "/user/status", method = RequestMethod.PUT)
    Response status(@RequestBody User user);

    @RequestMapping(value = "/role", method = RequestMethod.GET)
    Response getRole(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/role/add", method = RequestMethod.POST)
    Response addRole(@RequestBody Role role);

    @RequestMapping(value = "/manage", method = RequestMethod.POST)
    Response getManage(@RequestBody Manage manage);

    @RequestMapping(value = "/manage/{id}", method = RequestMethod.DELETE)
    Response remove(@PathVariable(value = "id")Integer id);

}
