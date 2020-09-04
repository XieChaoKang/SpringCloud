package com.xck.main.controller;

import entity.UserInfo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import util.JsonUtil;

import javax.annotation.Resource;

/**
 * @author admin
 */

@Api(tags = "测试")
@RestController
@RequestMapping("/consumer/")
public class TestController {

    private static final String PAY_URL = "http://localhost";

    @Resource
    private RestTemplate restTemplate;

    /**
     * 获取数据用getForObject
     * 发送数据用postForObject
     * */
    @RequestMapping("test")
    public JsonUtil<UserInfo> test(){
        return restTemplate.postForObject(PAY_URL+"/pay/test",null,JsonUtil.class);
    }
}
