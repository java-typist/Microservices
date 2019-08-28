package com.jason.rabbitmq.utils;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author Jason
 * @CreateTime 2019/8/27 10:32
 * @Modify 2019/8/27 10:32
 * @Version 1.0
 */
@Component
public class MessageSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello" + new Date();
        System.out.println("sender:" + context);
        this.amqpTemplate.convertAndSend("hello", context);
    }

}
