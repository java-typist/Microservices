package com.jason.order.dto;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/12 13:55
 * @modify 2019/9/12 13:55
 */
public class CartUpdateDTO {
    private Integer id;
    private Integer userId;
    private Integer status;
    private Integer count;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
