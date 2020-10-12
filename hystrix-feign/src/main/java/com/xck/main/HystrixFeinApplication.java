package com.xck.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xiechaokang
 * @date 2020/10/12
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixFeinApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixFeinApplication.class,args);
    }
}
