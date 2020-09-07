package com.xck.main.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author admin
 */
@RestController
@RequestMapping("/consulPay/")
public class ConsulPayController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("test")
    public String test(){
        return "Consul Pay Server:"+serverPort+ UUID.randomUUID().toString();
    }
}
