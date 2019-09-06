package com.jason.product.vo;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 10:24
 * @Modify 2019/9/5 10:24
 * @Version 1.0
 */
public class ProductShowVO {
    private Integer id;
    private String name;
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
