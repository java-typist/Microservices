package com.jason.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author Jason
 * @CreateTime 2019/8/21 8:39
 * @Modify 2019/8/21 8:39
 * @Version 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan(value = "com.jason.user.dao")
public class MybatisPageConfig {

//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        return new PaginationInterceptor();
//    }
}
