package com.jason.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jason.user.model.Manage;
import com.jason.user.model.Role;
import com.jason.user.model.User;

import java.util.Set;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 11:46
 * @Modify 2019/8/19 11:46
 * @Version 1.0
 */
public interface UserService extends IService<User> {
    User getUser(Integer userId);

    Role getRole(String name);

    Integer addUser(User user);

    Integer updateUser(User user);

    Integer addUserRole(User user);

    Integer removeUserRole(User user);

    Integer removeRoleManage(Role role);

    Integer addRole(Role role);

    Integer addRoleManage(Role role);

    Integer addManage(Manage manage);

    Integer removeManage(Integer id);

    Integer updateMsg(User user);
}
