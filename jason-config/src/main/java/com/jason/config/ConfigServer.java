package com.jason.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Jason
 * @CreateTime 2019/8/23 15:42
 * @Modify 2019/8/23 15:42
 * @Version 1.0
 */
@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient
public class ConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }
}
