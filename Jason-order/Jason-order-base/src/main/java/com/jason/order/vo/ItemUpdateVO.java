package com.jason.order.vo;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/12 13:57
 * @modify 2019/9/12 13:57
 */
public class ItemUpdateVO {
    private Integer id;
    private String orderNumber;
    private Integer status;
    private String reason;

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
}
