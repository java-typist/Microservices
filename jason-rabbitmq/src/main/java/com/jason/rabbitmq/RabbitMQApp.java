package com.jason.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Jason
 * @CreateTime 2019/8/27 10:29
 * @Modify 2019/8/27 10:29
 * @Version 1.0
 */
//@EnableEurekaClient
@SpringBootApplication
public class RabbitMQApp {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMQApp.class, args);
    }
}
