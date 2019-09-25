package com.jason.user.service;

import com.jason.user.dto.manage.ManageDTO;
import com.jason.user.dto.role.RoleDTO;
import com.jason.user.dto.user.UserAddDTO;
import com.jason.user.dto.user.UserDetailDTO;
import com.jason.user.dto.user.UserSimpleDTO;
import com.jason.user.dto.user.UserUpdateDTO;

public interface UserService{
    UserDetailDTO getUser(Integer userId);

    UserSimpleDTO getUser(String username);

    RoleDTO getRole(String name);

    Integer addUser(UserAddDTO user);

    Integer updateUser(UserUpdateDTO user);

    Integer addUserRole(UserAddDTO user);

    Integer removeUserRole(UserDetailDTO user);

    Integer removeRoleManage(RoleDTO role);

    Integer addRole(RoleDTO role);

    Integer addRoleManage(RoleDTO role);

    Integer addManage(ManageDTO manage);

    Integer removeManage(Integer id);

    Integer updateMsg(UserUpdateDTO user);
}
