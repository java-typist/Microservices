package com.jason.user.dao;

import com.jason.user.dto.user.UserDetailDTO;
import com.jason.user.dto.user.UserSimpleDTO;
import com.jason.user.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 14:30
 * @Modify 2019/8/19 14:30
 * @Version 1.0
 */
public interface UserMapper {

    @Results(id = "userMsg", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "nickname", column = "nickname"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles", column = "id", many = @Many(
                    select = "com.jason.user.dao.RoleMapper.findByUserId", fetchType = FetchType.LAZY))
    })
    @Select("select * from table_user where id=#{userId} and status!=-2")
    UserDetailDTO findById(@Param("userId") Integer userId);

    @Select("select * from table_user where username=#{username} and status!=-2")
    UserSimpleDTO findByUsername(@Param("username")String username);

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
            "<foreach collection='roleIds' item='roleId'>",
            "roleId=#{roleId}",
            "</foreach>",
            "</script>"
    })
    int deleteMap(User user);

    @Insert({"insert into table_user(username, nickname, password, phone, email, " +
            "status, create_time, update_time, login_time)values(#{username}, #{nickname}," +
            "#{password}, #{phone}, #{email}, #{status}, #{createTime}, #{updateTime}," +
            "#{loginTime}"})
    Integer insert(User user);

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
