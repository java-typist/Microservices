package com.jason.user.dto.user;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/19 14:51
 * @modify 2019/9/19 14:51
 */
public class UserSimpleDTO {
    private Integer id;
    private String nickName;
    private String phone;
    private String email;

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
