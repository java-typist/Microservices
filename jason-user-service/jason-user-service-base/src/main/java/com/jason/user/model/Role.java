package com.jason.user.model;

import java.util.Set;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 11:40
 * @Modify 2019/8/19 11:40
 * @Version 1.0
 */
public class Role {
    private Integer id;
    private String name;
    private Integer level;
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
