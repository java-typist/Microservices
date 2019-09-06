package com.jason.product.dto;

import java.util.Date;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 11:20
 * @Modify 2019/9/5 11:20
 * @Version 1.0
 */
public class ProductUpdateDTO {
    private Integer id;
    private String title;
    private String content;
    private Date updateTime;
    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
