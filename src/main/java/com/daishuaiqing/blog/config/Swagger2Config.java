package com.daishuaiqing.blog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 主要用途：开启在线接口文档和添加相关配置
 *
 * @author yizhiwazi
 */

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Value("${swagger.show}")
    private boolean swaggerShow;
    /**
     * 添加摘要信息(Docket)
     */
    @Bean
    public Docket controllerApi() {
        if(swaggerShow){
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(new ApiInfoBuilder()
                            .title("博客_接口文档")
                            .description("")
                            .contact(new Contact("代帅卿","",""))
                            .version("1.0")
                            .build())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.daishuaiqing.blog.controller"))
                    .paths(PathSelectors.any())
                    .build();
        }else{
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(new ApiInfoBuilder()
                            .title("")
                            .description("")
                            .contact(new Contact("","",""))
                            .version("")
                            .build())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.daishuaiqing.blog.controller"))
                    .paths(PathSelectors.none())
                    .build();
        }
    }
}