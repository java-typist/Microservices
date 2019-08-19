package com.jason.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jason.user.model.Role;
import org.apache.ibatis.annotations.*;

import java.util.Set;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 15:35
 * @Modify 2019/8/19 15:35
 * @Version 1.0
 */
public interface RoleMapper extends BaseMapper<Role> {

    @Results(id = "roleMsg", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "level", column = "level"),
            @Result(property = "manages", column = "id", many = @Many(
                    select = "com.jason.user.dao.ManageMapper.findByRoleId"))
    })
    @Select("select * from table_role where id in " +
            "(select roleId from map_user_role where userId=#{userId})")
    Role findByUserId(@Param("userId") Integer userId);
}
