package com.jason.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Jason
 * @CreateTime 2019/8/28 9:15
 * @Modify 2019/8/28 9:15
 * @Version 1.0
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
