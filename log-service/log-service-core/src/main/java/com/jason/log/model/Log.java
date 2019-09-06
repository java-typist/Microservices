package com.jason.log.model;

import java.util.Date;

/**
 * @Author Jason
 * @CreateTime 2019/9/3 10:39
 * @Modify 2019/9/3 10:39
 * @Version 1.0
 */
public class Log {
    private Integer id;
    private String username;
    private String action;
    private String type;
    private Date time;
    private String description;

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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
