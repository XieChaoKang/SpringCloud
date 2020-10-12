package com.xck.main.controller;

import com.xck.main.service.HystrixService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiechaokang
 * @date 2020/10/12
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Resource
    private HystrixService hystrixService;

    @RequestMapping("/ok")
    private String ok(){
        return hystrixService.ok();
    }

    @RequestMapping("/timeOut")
    private String timeOut(){
        return hystrixService.timeOut();
    }

}
