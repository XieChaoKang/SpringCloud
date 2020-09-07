package com.xck.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author admin
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulPayApplication.class,args);
    }
}
