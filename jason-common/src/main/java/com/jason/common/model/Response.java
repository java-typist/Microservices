package com.jason.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @Author Jason
 * @CreateTime 2019/8/20 11:47
 * @Modify 2019/8/20 11:47
 * @Version 1.0
 */
public class Response<T> implements Serializable {

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    @JsonIgnoreProperties(value = "handler")
    private T data;

    public void success(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public void error(Integer status, String message) {
        this.status = status;
        this.message = message;
        this.data = null;
    }
}
