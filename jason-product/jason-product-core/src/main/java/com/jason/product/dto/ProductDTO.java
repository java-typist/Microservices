package com.jason.product.dto;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 13:05
 * @Modify 2019/9/5 13:05
 * @Version 1.0
 */
public class ProductDTO {
    private Integer id;
    private String name;
    private Boolean enabled;
    private List<PropertyDTO> properties;

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

    public List<PropertyDTO> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyDTO> properties) {
        this.properties = properties;
    }
}
