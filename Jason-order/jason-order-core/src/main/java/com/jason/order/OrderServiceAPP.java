package com.jason.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Jason
 * @CreateTime 2019/9/9 10:49
 * @Modify 2019/9/9 10:49
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.jason.order.dao")
public class OrderServiceAPP {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceAPP.class, args);
    }
}
