package com.jason.product.po;

import java.io.Serializable;

/**
 * 商品详情表映射
 * @Author Jason
 * @CreateTime 2019/8/30 11:30
 * @Modify 2019/8/30 11:30
 * @Version 1.0
 */
public class ProductDetailPO implements Serializable {
    private Integer id;
    private Integer productId;
    private String title;
    private String content;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
