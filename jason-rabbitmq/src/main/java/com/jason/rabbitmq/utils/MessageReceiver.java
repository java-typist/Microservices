package com.jason.rabbitmq.utils;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author Jason
 * @CreateTime 2019/8/27 10:34
 * @Modify 2019/8/27 10:34
 * @Version 1.0
 */
@Component
@RabbitListener(queues = "hello")
public class MessageReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("receiver:" + hello);
    }
}
