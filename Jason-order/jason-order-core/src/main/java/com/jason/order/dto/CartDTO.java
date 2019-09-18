package com.jason.order.dto;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/12 15:12
 * @modify 2019/9/12 15:12
 */
public class CartDTO {

    private Integer id;
    private Integer productId;
    private Integer propertyId;
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
