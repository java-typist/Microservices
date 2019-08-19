package com.jason.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jason.user.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 14:30
 * @Modify 2019/8/19 14:30
 * @Version 1.0
 */
public interface UserMapper extends BaseMapper<User> {

    @Results(id = "userMsg", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "nickname", column = "nickname"),
            @Result(property = "password", column = "password"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "status", column = "status"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "loginTime", column = "login_time"),
            @Result(property = "roles", column = "id", many = @Many(
                    select = "com.jason.user.dao.RoleMapper.findByUserId", fetchType = FetchType.LAZY))
    })
    @Select("select * from table_user where id=#{userId}")
    User findById(@Param("userId") Integer userId);
}
