package com.jason.user.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/19 9:03
 * @modify 2019/9/19 9:03
 */
public class UserDetailVO implements Serializable {
    private Integer id;
    private String username;
    private String nickName;
    private String phone;
    private String email;
    private Integer status;
    private List<RoleVO> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<RoleVO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleVO> roles) {
        this.roles = roles;
    }
}
