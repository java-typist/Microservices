package com.jason.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Jason
 * @CreateTime 2019/8/21 14:34
 * @Modify 2019/8/21 14:34
 * @Version 1.0
 */
@EnableFeignClients(value = "com.jason.user.api")
@SpringBootApplication
@EnableEurekaClient
public class ProjectAPP {
    public static void main(String[] args) {
        SpringApplication.run(ProjectAPP.class, args);
    }
}
