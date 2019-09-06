package com.jason.product.dto;

import java.math.BigDecimal;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 11:23
 * @Modify 2019/9/5 11:23
 * @Version 1.0
 */
public class PropertyUpdateDTO {
    private Integer id;
    private String property;
    private BigDecimal price;
    private String preImage;
    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPreImage() {
        return preImage;
    }

    public void setPreImage(String preImage) {
        this.preImage = preImage;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
