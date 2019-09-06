package com.jason.log;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Jason
 * @CreateTime 2019/9/3 10:31
 * @Modify 2019/9/3 10:31
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan(value = "com.jason.log.dao")
public class LogServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(LogServiceApp.class, args);
    }
}
