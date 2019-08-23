package com.jason.user.fallback;

import com.jason.common.model.Constant;
import com.jason.common.model.Response;
import com.jason.user.api.UserAPI;
import com.jason.user.model.Manage;
import com.jason.user.model.Role;
import com.jason.user.model.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserAPI> {

    @Override
    public UserAPI create(Throwable throwable) {
        return new UserAPI() {
            @Override
            public Response login(User user) {
                Response response = new Response();
                response.error(Constant.REQUEST_FAILURE, throwable.getMessage());
                return response;
            }

            @Override
            public Response register(User user) {
                return null;
            }

            @Override
            public Response getUser(Integer userId) {
                return null;
            }

            @Override
            public Response update(User user) {
                return null;
            }

            @Override
            public Response getUser(String username) {
                Response response = new Response();
                System.out.println(username);
                response.error(Constant.REQUEST_FAILURE, throwable.getMessage());
                return response;
            }

            @Override
            public Response status(User user) {
                return null;
            }

            @Override
            public Response getRole(String name) {
                return null;
            }

            @Override
            public Response addRole(Role role) {
                return null;
            }

            @Override
            public Response getManage(Manage manage) {
                return null;
            }

            @Override
            public Response remove(Integer id) {
                return null;
            }
        };
    }
}
