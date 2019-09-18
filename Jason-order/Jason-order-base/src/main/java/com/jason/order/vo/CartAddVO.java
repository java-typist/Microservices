package com.jason.order.vo;

import java.io.Serializable;

/**
 * 添加前需要匹配是否有相同产品属性的cart条目，若存在则为修改个数
 * 不存在则重新添加新的条目
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/12 13:37
 * @modify 2019/9/12 13:37
 */
public class CartAddVO implements Serializable {
    private Integer userId;
    private Integer productId;
    private Integer propertyId;
    private Integer count;

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

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
