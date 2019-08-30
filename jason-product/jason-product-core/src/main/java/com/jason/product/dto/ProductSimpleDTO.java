package com.jason.product.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Jason
 * @CreateTime 2019/8/30 13:28
 * @Modify 2019/8/30 13:28
 * @Version 1.0
 */
public class ProductSimpleDTO implements Serializable {
    private Integer id;
    private String name;
    private String category;
    private Date createTime;
    private Boolean enabled;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
