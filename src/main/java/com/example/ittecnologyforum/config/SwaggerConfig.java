package com.example.ittecnologyforum.config;

/**
 * @author wadao
 * @version 1.0
 * @date 2020/6/5 23:21
 * @site niter.cn
 */

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

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
             //   .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.example.ittechnologyforum"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("IT Technology Forum API Doc")
                .description("This is a restful api document of IT Technology Forum.")
                .contact(new Contact("yinghuoshouxin",
                        "https://github.com/ConfusedDefensive/IT_Technology_Forum.git",
                        "2509717131@qq.com"))
                .version("1.0")
                .build();
    }

}
