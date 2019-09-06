package com.jason.product.dto;

import com.jason.product.vo.PropertyAddVO;

import java.util.Date;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 10:15
 * @Modify 2019/9/5 10:15
 * @Version 1.0
 */
public class ProductAddDTO {

    private Integer id;
    private String name;
    private String title;
    private String category;
    private String content;
    private Boolean enabled;
    private Date createTime;
    private Date updateTime;
    private List<PropertyAddDTO> properties;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<PropertyAddDTO> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyAddDTO> properties) {
        this.properties = properties;
    }
}
