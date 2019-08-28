package com.jason;

import com.jason.rabbitmq.RabbitMQApp;
import com.jason.rabbitmq.utils.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author Jason
 * @CreateTime 2019/8/27 10:37
 * @Modify 2019/8/27 10:37
 * @Version 1.0
 */
@SpringBootTest(classes = RabbitMQApp.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RabbitTest {

    @Autowired
    private MessageSender messageSender;

    @Test
    public  void hello(){
        messageSender.send();
    }
}
