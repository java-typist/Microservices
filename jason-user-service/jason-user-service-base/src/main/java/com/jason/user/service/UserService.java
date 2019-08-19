package com.jason.user.service;

import com.jason.user.model.User;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 11:46
 * @Modify 2019/8/19 11:46
 * @Version 1.0
 */
public interface UserService {
    User getUser(Integer userId);

    User getUser(String username);
}
