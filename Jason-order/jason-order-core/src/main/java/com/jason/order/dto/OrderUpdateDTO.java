package com.jason.order.dto;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/12 14:15
 * @modify 2019/9/12 14:15
 */
public class OrderUpdateDTO {
    private Integer id;
    private Integer userId;
    private Integer status;
    private String reason;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
