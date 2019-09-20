package com.jason.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jason.user.dto.user.UserAddDTO;
import com.jason.user.dto.user.UserUpdateDTO;
import com.jason.user.model.Manage;
import com.jason.user.model.Role;
import com.jason.user.model.User;

public interface UserService extends IService<User> {
    User getUser(Integer userId);

    Role getRole(String name);

    Integer addUser(UserAddDTO user);

    Integer updateUser(UserUpdateDTO user);

    Integer addUserRole(User user);

    Integer removeUserRole(User user);

    Integer removeRoleManage(Role role);

    Integer addRole(Role role);

    Integer addRoleManage(Role role);

    Integer addManage(Manage manage);

    Integer removeManage(Integer id);

    Integer updateMsg(User user);
}
