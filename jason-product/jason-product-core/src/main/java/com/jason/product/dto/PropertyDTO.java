package com.jason.product.dto;

import java.math.BigDecimal;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 13:07
 * @Modify 2019/9/5 13:07
 * @Version 1.0
 */
public class PropertyDTO {
    private Integer id;
    private String property;
    private BigDecimal price;
    private String preImage;
    private Boolean enabled;
    private Integer count;

    public Integer getId() {
        return id;
    }

    public String getPreImage() {
        return preImage;
    }

    public void setPreImage(String preImage) {
        this.preImage = preImage;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
