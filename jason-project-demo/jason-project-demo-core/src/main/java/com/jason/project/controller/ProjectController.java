package com.jason.project.controller;

import com.jason.common.model.Response;
import com.jason.user.api.UserAPI;
import com.jason.user.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Jason
 * @CreateTime 2019/8/21 14:36
 * @Modify 2019/8/21 14:36
 * @Version 1.0
 */
@RestController
public class ProjectController {

    @Resource
    private UserAPI userAPI;

    @PostMapping(value = "/enter")
    public Response enter(@RequestBody User user) {
        Response response = new Response();
        Response result = userAPI.getUser(user.getUsername());
        return result;
    }
}
