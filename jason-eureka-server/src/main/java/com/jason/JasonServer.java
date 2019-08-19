package com.jason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 11:11
 * @Modify 2019/8/19 11:11
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class JasonServer {

    public static void main(String[] args) {
        SpringApplication.run(JasonServer.class, args);
    }
}
