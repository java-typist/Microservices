package com.jason.order.dto;

import java.math.BigDecimal;

/**
 * @Author Jason
 * @CreateTime 2019/9/12 10:58
 * @Modify 2019/9/12 10:58
 * @Version 1.0
 */
public class ItemAddDTO {

    private String orderNumber;
    private Integer productId;
    private Integer propertyId;
    private String preImage;
    private String title;
    private String property;
    private BigDecimal price;
    private Integer count;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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

    public String getPreImage() {
        return preImage;
    }

    public void setPreImage(String preImage) {
        this.preImage = preImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
