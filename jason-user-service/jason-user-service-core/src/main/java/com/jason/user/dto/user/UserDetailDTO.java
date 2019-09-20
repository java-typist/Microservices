package com.jason.user.dto.user;

import com.jason.user.dto.role.RoleDTO;

import java.util.List;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/19 14:41
 * @modify 2019/9/19 14:41
 */
public class UserDetailDTO {

    private Integer id;
    private String nickName;
    private String image;
    private String phone;
    private String email;
    private Integer status;
    private List<RoleDTO> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public List<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDTO> roles) {
        this.roles = roles;
    }
}
