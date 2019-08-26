package com.jason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Author Jason
 * @CreateTime 2019/8/26 14:36
 * @Modify 2019/8/26 14:36
 * @Version 1.0
 */
@SpringBootApplication
@RefreshScope
public class ConfigClientApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp.class, args);
    }
}
