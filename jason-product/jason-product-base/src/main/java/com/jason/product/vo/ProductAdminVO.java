package com.jason.product.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 10:59
 * @Modify 2019/9/5 10:59
 * @Version 1.0
 */
public class ProductAdminVO implements Serializable {
    private Integer id;
    private String name;
    private String category;
    private String title;
    private Boolean enabled;
    private List<PropertyVO> properties;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<PropertyVO> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyVO> properties) {
        this.properties = properties;
    }
}
