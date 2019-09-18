package com.jason.order.vo;

import java.io.Serializable;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/12 13:52
 * @modify 2019/9/12 13:52
 */
public class CartUpdateVO implements Serializable {
    private Integer id;
    private Integer userId;
    private Integer count;
    private Integer status;

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
