package com.jason.project;

import com.jason.user.api.UserAPI;
import com.jason.user.fallback.UserServiceFallbackFactory;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @Author Jason
 * @CreateTime 2019/8/21 14:34
 * @Modify 2019/8/21 14:34
 * @Version 1.0
 */
@EnableFeignClients(value = "com.jason.user.api")
@SpringBootApplication
@EnableEurekaClient
public class ProjectAPP {
    public static void main(String[] args) {
        SpringApplication.run(ProjectAPP.class, args);
    }

    @Bean
    UserServiceFallbackFactory userServiceFallbackFactory() {
        return new UserServiceFallbackFactory();
    }

    @Bean
    ServletRegistrationBean servletRegistrationBean() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean bean = new ServletRegistrationBean(streamServlet);
        bean.setLoadOnStartup(1);
        bean.addUrlMappings("/hystrix.stream");
        bean.setName("HystrixMetricsStreamServlet");
        return bean;
    }

}
