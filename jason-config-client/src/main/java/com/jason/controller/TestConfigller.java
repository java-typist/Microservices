package com.jason.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jason
 * @CreateTime 2019/8/26 14:37
 * @Modify 2019/8/26 14:37
 * @Version 1.0
 */
@RestController
@RefreshScope
public class TestConfigller {

    @Value(value = "${from}")
    private String from;

    @RequestMapping(value = "/goushi")
    public String goushi() {
        return from;
    }
}
