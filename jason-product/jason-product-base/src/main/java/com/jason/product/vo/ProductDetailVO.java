package com.jason.product.vo;

import java.io.Serializable;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 10:28
 * @Modify 2019/9/5 10:28
 * @Version 1.0
 */
public class ProductDetailVO implements Serializable {

    private String name;
    private String title;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
