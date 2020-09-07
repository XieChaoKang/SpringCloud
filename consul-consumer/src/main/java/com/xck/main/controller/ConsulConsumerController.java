package com.xck.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author admin
 */

@RestController
@RequestMapping("/consulConsumer/")
public class ConsulConsumerController {

    private final static String PAY_URL = "http://consul-pay";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("test")
    private String test(){
        return restTemplate.getForObject(PAY_URL+"/consulPay/test",String.class);
    }
}
