package com.xck.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xck
 */

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.xck.main.mapper")
public class PayMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayMainApplication.class,args);
    }
}
