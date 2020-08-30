package com.xck.main.controller;

import com.xck.main.entity.UserInfo;
import com.xck.main.util.JsonUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    @GetMapping("test")
    public JsonUtil<UserInfo> test(){
        return restTemplate.postForObject(PAY_URL+"/pay/test",null,JsonUtil.class);
    }
}
