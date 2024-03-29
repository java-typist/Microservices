package com.jason.user.dto.user;

import java.util.List;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/19 14:38
 * @modify 2019/9/19 14:38
 */
public class UserAddDTO {

    private String username;
    private String password;
    private String nickname;
    private String phone;
    private String email;
    private List<Integer> roleIds;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }
}
