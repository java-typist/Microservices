package com.jason.order.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/12 10:55
 * @Modify 2019/9/12 10:55
 * @Version 1.0
 */
public class OrderAddVO implements Serializable {

    private Integer userId;
    private Boolean discount;
    private Integer couponId;
    private List<ItemAddVO> items;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public List<ItemAddVO> getItems() {
        return items;
    }

    public void setItems(List<ItemAddVO> items) {
        this.items = items;
    }
}
