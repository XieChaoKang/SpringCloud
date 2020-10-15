package com.xck.main.controller;

import com.xck.main.service.IProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiechaokang
 * @date 2020/10/15
 */
@RestController
@RequestMapping(value = "/rabbitMQ")
public class ProviderController {

    @Resource
    private IProviderService iProviderService;

    @RequestMapping("/send")
    public void sendMassage(){
        iProviderService.send();
    }
}
