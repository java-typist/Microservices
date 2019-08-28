package com.jason.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author Jason
 * @CreateTime 2019/8/23 11:45
 * @Modify 2019/8/23 11:45
 * @Version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class DashBoardApp {

    public static void main(String[] args) {
        SpringApplication.run(DashBoardApp.class, args);
    }
}
