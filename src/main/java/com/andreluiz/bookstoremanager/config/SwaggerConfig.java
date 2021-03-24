package com.andreluiz.bookstoremanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "com.andreluiz.bookstoremanager";
    private static final String BOOKSTORE_MANAGER_COURSE = "Bookstore Manager Course";
    private static final String BOOKSTORE_MANAGER_API_PROFESSIONAL = "Bookstore Manager Api Professional";
    private static final String VERSION = "1.0.0";
    private static final String NAME = "André Luiz";
    private static final String URL = "https://github.com/Andr3zinh00";
    private static final String EMAIL = "andrelp1015@gmail.com";


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any()).build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(BOOKSTORE_MANAGER_COURSE)
                .description(BOOKSTORE_MANAGER_API_PROFESSIONAL)
                .version(VERSION).contact(new Contact(NAME, URL, EMAIL))
                .build();
    }
}
