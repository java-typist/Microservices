package com.jason.product.dto;

import java.math.BigDecimal;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 10:51
 * @Modify 2019/9/5 10:51
 * @Version 1.0
 */
public class PropertyAddDTO {

    private Integer productId;
    private String property;
    private BigDecimal price;
    private Boolean enabled;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
