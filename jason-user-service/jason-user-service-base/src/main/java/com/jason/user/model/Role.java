package com.jason.user.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Set;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 11:40
 * @Modify 2019/8/19 11:40
 * @Version 1.0
 */
@TableName(value = "table_role")
public class Role {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer level;
    @TableField(exist = false)
    private Set<Manage> manages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Set<Manage> getManages() {
        return manages;
    }

    public void setManages(Set<Manage> manages) {
        this.manages = manages;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", manages=" + manages +
                '}';
    }
}
