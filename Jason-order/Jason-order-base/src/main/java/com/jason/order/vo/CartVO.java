package com.jason.order.vo;

import java.math.BigDecimal;

/**
 * @author Jason
 * @version 1.0
 * @createTime 2019/9/12 15:29
 * @modify 2019/9/12 15:29
 */
public class CartVO {
    private Integer id;
    private Integer productId;
    private Integer propertyId;
    private String property;
    private BigDecimal price;
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

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
