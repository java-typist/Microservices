package com.jason.product.vo;

import java.math.BigDecimal;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 10:51
 * @Modify 2019/9/5 10:51
 * @Version 1.0
 */
public class PropertyAddVO {

    private String property;
    private BigDecimal price;
    private Boolean enabled;
    private String preImage;

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

    public String getPreImage() {
        return preImage;
    }

    public void setPreImage(String preImage) {
        this.preImage = preImage;
    }
}
