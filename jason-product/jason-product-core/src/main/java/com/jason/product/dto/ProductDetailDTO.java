package com.jason.product.dto;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 13:03
 * @Modify 2019/9/5 13:03
 * @Version 1.0
 */
public class ProductDetailDTO {

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
