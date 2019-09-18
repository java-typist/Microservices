package com.jason.order.dto;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/12 11:23
 * @Modify 2019/9/12 11:23
 * @Version 1.0
 */
public class OrderAddDTO {

    private Integer userId;
    private String orderNumber;
    private Boolean discount;
    private Integer couponId;
    private List<ItemAddDTO> items;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Boolean getDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public List<ItemAddDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemAddDTO> items) {
        this.items = items;
    }
}

