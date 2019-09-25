package com.jason.user.dao;

import com.jason.user.dto.role.RoleDTO;
import com.jason.user.model.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 15:35
 * @Modify 2019/8/19 15:35
 * @Version 1.0
 */
public interface RoleMapper{

    @Results(id = "roleMsg", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "manages", column = "id", many = @Many(
                    select = "com.jason.user.dao.ManageMapper.findByRoleId", fetchType = FetchType.LAZY))
    })
    @Select("select * from table_role where id in " +
            "(select roleId from map_user_role where userId=#{userId})")
    List<RoleDTO> findByUserId(@Param("userId") Integer userId);

    @Results(id = "role", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "manages", column = "id", many = @Many(
                    select = "com.jason.user.dao.ManageMapper.findByRoleId", fetchType = FetchType.LAZY))
    })
    @Select("select * from table_role where name=#{name}")
    RoleDTO getRole(@Param("name") String name);

    @Insert({
            "<script>",
            "insert into map_role_manage",
            "(roleId, manageId)values",
            "<foreach collection='manages' item='manage' separator=','>",
            "(#{id}, #{manage.id})",
            "</foreach>",
            "</script>"
    })
    int relation(Role role);

    @Insert({"insert into table_role(name, level)values(#{name}, #{level})"})
    Integer insert(Role role);

    @Delete({
            "<script>",
            "delete from map_role_manage",
            "where roleId=#{Id} and ",
            "<foreach collection='manages' item='manage'>",
            "manageId=#{manage.id}",
            "</foreach>",
            "</script>"
    })
    int deleteMap(Role role);
}
