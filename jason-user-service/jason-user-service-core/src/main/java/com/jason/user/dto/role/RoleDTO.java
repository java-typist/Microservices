package com.jason.user.dto.role;

import com.jason.user.dto.manage.ManageDTO;

import java.util.List;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/19 14:49
 * @modify 2019/9/19 14:49
 */
public class RoleDTO {

    private Integer id;
    private String name;
    private List<ManageDTO> manages;

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

    public List<ManageDTO> getManages() {
        return manages;
    }

    public void setManages(List<ManageDTO> manages) {
        this.manages = manages;
    }
}
