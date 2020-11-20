package com.exam.servlce;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("com.exam.servlce.mapper")
@ComponentScan(basePackages = {"com.exam"})
public class TUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(TUserApplication.class,args);
    }
}
