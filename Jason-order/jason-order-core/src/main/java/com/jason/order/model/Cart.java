package com.jason.order.model;

import java.util.Date;

/**
 * @Author Jason
 * @CreateTime 2019/9/9 13:42
 * @Modify 2019/9/9 13:42
 * @Version 1.0
 */
public class Cart {
    private Integer id;
    private Integer userId;
    private Integer productId;
    private Boolean available;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
