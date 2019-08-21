package com.jason.user.config;

import io.swagger.models.Swagger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/8/20 11:10
 * @Modify 2019/8/20 11:10
 * @Version 1.0
 */
@Configuration
@ConditionalOnClass(value = {Swagger.class})
@EnableSwagger2
public class SwaggerConfig {

    @Value(value = "${spring.application.name}")
    private String appName;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(info())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jason.user.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(parameters());

    }

    private ApiInfo info() {
        return new ApiInfoBuilder()
                .title(appName + "api message")
                .description(appName + "api message")
                .contact(new Contact("Jason", "http://github.com/Jasonneeed", "mail.Jasonneeed@163.com"))
                .version("1.0")
                .build();
    }

    private List<Parameter> parameters() {
        ParameterBuilder builder = new ParameterBuilder();
        List<Parameter> parameters = new ArrayList<>();
        builder.name("authorization")
                .description("authorization")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();
        parameters.add(builder.build());
        return parameters;
    }
}
