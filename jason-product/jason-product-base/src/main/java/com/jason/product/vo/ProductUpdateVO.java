package com.jason.product.vo;

import java.io.Serializable;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 10:22
 * @Modify 2019/9/5 10:22
 * @Version 1.0
 */
public class ProductUpdateVO implements Serializable {

    private Integer id;
    private String title;
    private String content;
    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
