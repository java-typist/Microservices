package com.jason.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jason.user.model.Manage;
import org.apache.ibatis.annotations.*;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 15:36
 * @Modify 2019/8/19 15:36
 * @Version 1.0
 */
public interface ManageMapper extends BaseMapper<Manage> {

    @Results(id = "manageMsg", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "directory", column = "directory"),
    })
    @Select(value = "select * From table_manage where id in " +
            "(select manageId from map_role_manage where roleId=#{roleId})")
    Manage findByRoleId(@Param("roleId") Integer roleId);
}
