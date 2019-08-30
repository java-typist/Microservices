package com.jason.project.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Jason
 * @CreateTime 2019/8/29 13:57
 * @Modify 2019/8/29 13:57
 * @Version 1.0
 */
public class Resource implements Serializable {

    private Integer id;
    private String path;
    private Date uploadTime;
    private Integer up;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
