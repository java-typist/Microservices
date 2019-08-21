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

    @Insert({
            "<script>",
            "insert into map_user_role",
            "(userId, roleId)",
            "values(#{userId},",
            "<foreach collection='roles' item='role' separator=',' close=')'>",
            "#{role.id}",
            "</foreach>",
            "</script>"
    })
    int uRelation(User user);

    @Delete({
            "<script>",
            "delete from map_user_role",
            "where userId=#{id} and ",
            "<foreach collection='roles' item='role'>",
            "roleId=#{role.id}",
            "</foreach>",
            "</script>"
    })
    int deleteMap(User user);

    @Update({
            "<script>",
            "update table_user <set>",
            "<if test='nickname !=null'>name=#{name},</if>",
            "<if test='password !=null'>password=#{password},</if>",
            "<if test='phone != null'>phone=#{phone},</if>",
            "<if test='email != null'>email=#{email},</if>",
            "<if test='status != null'>status=#{status},</if>",
            "update_time=#{updateTime}",
            "</set>",
            "where username=#{username}",
            "</script>"
    })
    int dynamicUpdate(User user);
}
