package com.xck.main.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xck.main.service.HystrixFeinService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiechaokang
 * @date 2020/10/12
 */

@RestController
@RequestMapping("/hystrixFeign")
//@DefaultProperties(defaultFallback = "globalFallBack") //配置全局兜底方法
public class HystrixFeignController {

    @Resource
    private HystrixFeinService hystrixFeinService;

    @RequestMapping("/ok")
    public String ok(){
        return hystrixFeinService.ok();
    }

    /**在客户端模拟服务端出错 并在客户端配置相应的服务降级 实现自我保护*/
    @RequestMapping("/timeOut")
    /*@HystrixCommand(fallbackMethod = "fallBack",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })*/
    //@HystrixCommand
    public String timeOut(){
        //模拟服务出错 调用全局兜底方法
        //int age = 10/0;
        return hystrixFeinService.timeOut();
    }

    /**兜底方法*/
    public String fallBack(){
        return "服务端出错，调用兜底方法，结束请求，自我保护";
    }

    /**全局兜底方法*/
    public String globalFallBack(){
        return "服务端出错，调用全局兜底方法，结束请求，自我保护";
    }
}
