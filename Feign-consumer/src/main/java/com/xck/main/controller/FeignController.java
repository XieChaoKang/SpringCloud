package com.xck.main.controller;

import com.xck.main.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xck
 */
@RestController
@RequestMapping("/Feign/")
public class FeignController {

    @Resource
    private FeignService feignService;

    @RequestMapping("test")
    public Object test(){
        return feignService.test();
    }
}
