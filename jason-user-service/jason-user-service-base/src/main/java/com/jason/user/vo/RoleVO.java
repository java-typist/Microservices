package com.jason.user.vo;

import java.util.List;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/19 9:04
 * @modify 2019/9/19 9:04
 */
public class RoleVO {

    private Integer id;
    private String name;
    private List<ManageVO> manages;

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

    public List<ManageVO> getManages() {
        return manages;
    }

    public void setManages(List<ManageVO> manages) {
        this.manages = manages;
    }
}
