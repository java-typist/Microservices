package com.jason.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jason.common.model.Constant;
import com.jason.user.dao.ManageMapper;
import com.jason.user.dao.RoleMapper;
import com.jason.user.dao.UserMapper;
import com.jason.user.dto.user.UserAddDTO;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private ManageMapper manageMapper;

    @Override
    public User getUser(Integer userId) {
        return userMapper.findById(userId);
    }

    @Override
    public Role getRole(String name) {
        QueryWrapper<Role> roleWrapper = new QueryWrapper<>();
        roleWrapper.eq("name", name);
        return roleMapper.selectOne(roleWrapper);
    }

    @Override
    @Transactional
    public Integer addUser(UserAddDTO user) {
        User user1 = new User();
        int result = userMapper.insert(ConvertUtil.convertAdd(user));
        if (result > 0 && user1.getRoles() != null) {
            if (addUserRole(user1) > 0) {
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
        return null;
    }

    /**
     * 增加用户与role映射
     *
     * @param user
     * @return 返回受影响行数
     */
    @Override
    public Integer addUserRole(User user) {
        return userMapper.uRelation(user);
    }

    /**
     * 删除用户与role映射
     *
     * @param user
     * @return 返回受影响行数
     */
    @Override
    public Integer removeUserRole(User user) {
        return userMapper.deleteMap(user);
    }

    @Override
    public Integer removeRoleManage(Role role) {
        return roleMapper.deleteMap(role);
    }

    /**
     * 增加角色与权限映射
     *
     * @param role
     * @return 返回受影响行数
     */
    @Override
    public Integer addRoleManage(Role role) {
        return roleMapper.relation(role);
    }

    @Override
    public Integer addRole(Role role) {
        int result = roleMapper.insert(role);
        if (result > 0) {
            if (addRoleManage(role) > 0) {
                return Constant.MAPPER_SUCCESS;
            }
        }
        return Constant.MAPPER_FAILURE;
    }

    @Override
    public Integer addManage(Manage manage) {
        return manageMapper.insert(manage);
    }

    @Override
    public Integer removeManage(Integer id) {
        return manageMapper.deleteById(id);
    }

    @Override
    public Integer updateMsg(User user) {
        return userMapper.dynamicUpdate(user);
    }

}
