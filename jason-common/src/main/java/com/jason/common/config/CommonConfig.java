package com.jason.common.config;

import com.jason.common.model.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author Jason
 * @CreateTime 2019/8/20 11:50
 * @Modify 2019/8/20 11:50
 * @Version 1.0
 */
@Component
public class CommonConfig {

    @Bean
    public Response response() {
        return new Response();
    }
}
