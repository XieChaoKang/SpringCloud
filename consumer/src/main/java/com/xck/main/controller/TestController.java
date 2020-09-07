package com.xck.main.controller;

import io.swagger.annotations.Api;
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

    private static final String PAY_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    /**
     * 获取数据用getForObject
     * 发送数据用postForObject
     * */
    @RequestMapping("test")
    public JsonUtil test(){
        String result = restTemplate.postForObject(PAY_URL + "/pay/test", null, String.class);
        return new JsonUtil(200,"SUCCESS",result);
    }
}
