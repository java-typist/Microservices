package com.jason.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Jason
 * @CreateTime 2019/8/30 11:39
 * @Modify 2019/8/30 11:39
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.jason.product.dao")
public class ProductServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApp.class, args);
    }
}
