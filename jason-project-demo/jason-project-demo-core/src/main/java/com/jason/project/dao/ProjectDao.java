package com.jason.project.dao;

import com.jason.project.model.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Jason
 * @CreateTime 2019/8/29 14:00
 * @Modify 2019/8/29 14:00
 * @Version 1.0
 */
public interface ProjectDao {

    Project getById(@Param(value = "id") Integer id);



}
