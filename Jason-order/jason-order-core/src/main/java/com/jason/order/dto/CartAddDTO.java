package com.jason.order.dto;

/**
 * @author  Jason
 * @since  2019/9/12 13:10
 * @Modify 2019/9/12 13:10
 * @Version 1.0
 */
public class CartAddDTO {

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
