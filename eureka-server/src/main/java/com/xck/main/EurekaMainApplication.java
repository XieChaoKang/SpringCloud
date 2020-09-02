package com.xck.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author admin
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMainApplication.class,args);
    }
}
