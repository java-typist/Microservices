package com.jason.product.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品所选属性表映射
 * @Author Jason
 * @CreateTime 2019/8/30 11:33
 * @Modify 2019/8/30 11:33
 * @Version 1.0
 */
public class ProductProperPO implements Serializable {

    private Integer id;
    private Integer productId;
    private String property;
    private BigDecimal price;
    private String preImage;
    private Integer stock;
    private Boolean enabled;

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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
