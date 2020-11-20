package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableEurekaClient
//启动类开启Swagger2
@EnableSwagger2
public class SwaggerServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(SwaggerServerApplication.class,args);
    }


}
