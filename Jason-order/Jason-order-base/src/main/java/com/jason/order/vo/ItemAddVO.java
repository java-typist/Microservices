package com.jason.order.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author Jason
 * @CreateTime 2019/9/12 10:51
 * @Modify 2019/9/12 10:51
 * @Version 1.0
 */
public class ItemAddVO implements Serializable {

    private Integer productId;
    private Integer propertyId;
    private String preImage;
    private String title;
    private String property;
    private BigDecimal price;
    private Integer count;

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
