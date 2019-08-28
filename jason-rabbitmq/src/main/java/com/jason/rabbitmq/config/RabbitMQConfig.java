package com.jason.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Jason
 * @CreateTime 2019/8/27 10:35
 * @Modify 2019/8/27 10:35
 * @Version 1.0
 */
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue queue() {
        return new Queue("hello");  
    }
}
