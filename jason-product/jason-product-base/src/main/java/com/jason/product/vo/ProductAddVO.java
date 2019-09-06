package com.jason.product.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 10:09
 * @Modify 2019/9/5 10:09
 * @Version 1.0
 */
public class ProductAddVO implements Serializable {

    private String name;
    private String category;
    private String title;
    private String content;
    private Boolean enabled;
    private List<PropertyAddVO> properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public List<PropertyAddVO> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyAddVO> properties) {
        this.properties = properties;
    }
}
