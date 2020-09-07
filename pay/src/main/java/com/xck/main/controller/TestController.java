package com.xck.main.controller;

import com.google.gson.Gson;

import com.xck.main.service.InfoService;
import entity.UserInfo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author admin
 */

@Api(tags = "测试")
@RestController
@RequestMapping("/pay/")
public class TestController {

    @Autowired
    private InfoService infoService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("test")
    public String test(){
        List<UserInfo> userInfoList = infoService.queryInfo();
        Gson gson = new Gson();
        return gson.toJson(userInfoList);
    }

    @RequestMapping("discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            System.out.println("***** element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("PAY-SERVICE");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
