package com.jason.product.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品表数据映射
 * @Author Jason
 * @CreateTime 2019/8/30 11:29
 * @Modify 2019/8/30 11:29
 * @Version 1.0
 */
public class ProductPO implements Serializable {

    private Integer id;
    private String name;
    private Integer categoryId;
    private Date createTime;
    private Date updateTime;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
