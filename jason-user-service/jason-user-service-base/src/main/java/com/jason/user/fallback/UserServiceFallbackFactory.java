package com.jason.user.fallback;

import com.jason.common.model.Constant;
import com.jason.common.model.Response;
import com.jason.user.api.UserAPI;
import com.jason.user.vo.*;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserAPI> {

    @Override
    public UserAPI create(Throwable throwable) {
        return new UserAPI() {
            @Override
            public Response login(LoginVO user) {
                Response response = new Response();
                response.error(Constant.REQUEST_FAILURE, throwable.getMessage());
                return response;
            }

            @Override
            public Response register(UserAddVO user) {
                return null;
            }

            @Override
            public Response getUser(Integer userId) {
                return null;
            }

            @Override
            public Response update(UserUpdateVO user) {
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
            public Response status(UserUpdateVO user) {
                return null;
            }

            @Override
            public Response getRole(String name) {
                return null;
            }

            @Override
            public Response addRole(RoleVO role) {
                return null;
            }

            @Override
            public Response getManage(ManageVO manage) {
                return null;
            }

            @Override
            public Response remove(Integer id) {
                return null;
            }
        };
    }
}
