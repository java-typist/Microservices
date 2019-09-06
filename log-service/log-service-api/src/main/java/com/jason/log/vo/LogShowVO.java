package com.jason.log.vo;

import java.util.Date;

/**
 * @Author Jason
 * @CreateTime 2019/9/3 10:42
 * @Modify 2019/9/3 10:42
 * @Version 1.0
 */
public class LogShowVO {
    private String username;
    private String type;
    private String action;
    private Date time;
    private String description;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
