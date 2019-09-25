package com.jason.user.vo;

import java.io.Serializable;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/23 9:52
 * @modify 2019/9/23 9:52
 */
public class LoginVO implements Serializable {

    private String username;
    private String password;
    private String phone;
    private String email;

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
}
