package com.xck.main.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import util.JsonUtil;

/**
 * @author xck
 */
@Component
@FeignClient(value = "PAY-SERVICE")
public interface FeignService {

     @RequestMapping(value = "/pay/feign"  ,produces = "text/plain; charset=UTF-8")
     String test();
}
