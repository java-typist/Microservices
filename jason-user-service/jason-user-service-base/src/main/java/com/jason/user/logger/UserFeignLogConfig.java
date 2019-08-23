package com.jason.user.logger;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Jason
 * @CreateTime 2019/8/22 15:29
 * @Modify 2019/8/22 15:29
 * @Version 1.0
 */
@Configuration
public class UserFeignLogConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
