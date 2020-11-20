package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaServer //开启eureka\
@EnableSwagger2
public class ExamApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExamApplication.class,args);
    }
}
