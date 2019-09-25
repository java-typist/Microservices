package com.jason.user.dao;

import com.jason.user.dto.manage.ManageDTO;
import com.jason.user.model.Manage;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 15:36
 * @Modify 2019/8/19 15:36
 * @Version 1.0
 */
public interface ManageMapper {

    @Results(id = "manageMsg", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "directory", column = "directory"),
    })
    @Select(value = "select * From table_manage where id in " +
            "(select manageId from map_role_manage where roleId=#{roleId})")
    List<ManageDTO> findByRoleId(@Param("roleId") Integer roleId);

//    @Update("update table_manage set")

    @Insert("insert into table_manage(name, directory)values(#{name}, #{directory})")
    Integer insert(Manage manage);
}
