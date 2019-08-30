package com.jason.project.model;

import com.jason.user.model.User;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/8/29 13:32
 * @Modify 2019/8/29 13:32
 * @Version 1.0
 */
public class Project implements Serializable {

    private Integer id;
    private String productType;
    private String problemType;
    private String toolVersion;
    private String description;
    private String solution;
    private Date createTime;
    private Date updateTime;
    private Date endTime;
    private Integer status;
    private Integer creatorId;
    private User creator;
    private List<User> chargers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public String getToolVersion() {
        return toolVersion;
    }

    public void setToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
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

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public List<User> getChargers() {
        return chargers;
    }

    public void setChargers(List<User> chargers) {
        this.chargers = chargers;
    }
}
