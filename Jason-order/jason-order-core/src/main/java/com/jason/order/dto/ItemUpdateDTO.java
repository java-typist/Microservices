package com.jason.order.dto;

import java.util.Date;

/**
 * 动态sql了
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/12 14:00
 * @modify 2019/9/12 14:00
 */
public class ItemUpdateDTO {
    private Integer id;
    private String orderNumber;
    private Integer status;
    private String reason;
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
