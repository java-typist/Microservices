package com.jason.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Jason
 * @CreateTime 2019/8/23 14:28
 * @Modify 2019/8/23 14:28
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class GatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class, args);
    }
}
