package com.jason.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 13:00
 * @Modify 2019/8/19 13:00
 * @Version 1.0
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@MapperScan(value = "com.jason.user.dao")
public class UserServiceAPP {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceAPP.class, args);
    }
}
