package com.jason.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author Jason
 * @CreateTime 2019/8/20 11:47
 * @Modify 2019/8/20 11:47
 * @Version 1.0
 */
public class Response<T> {

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
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
