package com.jason.user.impl;

import com.jason.common.model.Constant;
import com.jason.user.dao.ManageMapper;
import com.jason.user.dao.RoleMapper;
import com.jason.user.dao.UserMapper;
import com.jason.user.dto.manage.ManageDTO;
import com.jason.user.dto.role.RoleDTO;
import com.jason.user.dto.user.UserAddDTO;
import com.jason.user.dto.user.UserDetailDTO;
import com.jason.user.dto.user.UserSimpleDTO;
import com.jason.user.dto.user.UserUpdateDTO;
import com.jason.user.model.Manage;
import com.jason.user.model.Role;
import com.jason.user.model.User;
import com.jason.user.service.UserService;
import com.jason.user.utils.ConvertUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Jason
 * @CreateTime 2019/8/20 10:02
 * @Modify 2019/8/20 10:02
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private ManageMapper manageMapper;

    @Override
    public UserDetailDTO getUser(Integer userId) {
         return userMapper.findById(userId);
    }

    @Override
    public UserSimpleDTO getUser(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public RoleDTO getRole(String name) {
        return  roleMapper.getRole(name);
    }

    @Override
    @Transactional
    public Integer addUser(UserAddDTO user) {
        User user1 = new User();
        int result = userMapper.insert(ConvertUtil.convertAdd(user));
        if (result > 0 && user.getRoleIds() != null) {
            if (addUserRole(user) > 0) {
                return Constant.MAPPER_SUCCESS;
            }
        }
        return Constant.MAPPER_FAILURE;
    }

    /**
     * 修改用户自身信息
     *
     * @param user
     * @return
     */
    @Override
    public Integer updateUser(UserUpdateDTO user) {
        User user1 = ConvertUtil.convertUpdate(user);
        return userMapper.dynamicUpdate(user1);
    }

    /**
     * 增加用户与role映射
     *
     * @param user
     * @return 返回受影响行数
     */
    @Override
    public Integer addUserRole(UserAddDTO user) {
        User user1 = ConvertUtil.convertAdd(user);
        return userMapper.uRelation(user1);
    }

    /**
     * 删除用户与role映射
     *
     * @param user
     * @return 返回受影响行数
     */
    @Override
    @Deprecated
    public Integer removeUserRole(UserDetailDTO user) {
        return userMapper.deleteMap(null);
    }

    @Override
    public Integer removeRoleManage(RoleDTO role) {
        Role role1 = ConvertUtil.convertRole(role);
        return roleMapper.deleteMap(role1);
    }

    /**
     * 增加角色与权限映射
     *
     * @param role
     * @return 返回受影响行数
     */
    @Override
    public Integer addRoleManage(RoleDTO role) {
        Role role1 = ConvertUtil.convertRole(role);
        return roleMapper.relation(role1);
    }

    @Override
    public Integer addRole(RoleDTO role) {
        Role role1 = ConvertUtil.convertRole(role);
        int result = roleMapper.insert(role1);
        if (result > 0) {
            if (addRoleManage(role) > 0) {
                return Constant.MAPPER_SUCCESS;
            }
        }
        return Constant.MAPPER_FAILURE;
    }

    @Override
    public Integer addManage(ManageDTO manage) {
        Manage manage1 = ConvertUtil.convertMange(manage);
        return manageMapper.insert(manage1);
    }

    @Override
    public Integer removeManage(Integer id) {
//        return manageMapper.deleteById(id);
        return null;
    }

    @Override
    public Integer updateMsg(UserUpdateDTO user) {
        User user1 = ConvertUtil.convertUpdate(user);
        return userMapper.dynamicUpdate(user1);
    }

}
