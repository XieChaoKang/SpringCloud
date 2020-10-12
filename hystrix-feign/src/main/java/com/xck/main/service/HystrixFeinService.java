package com.xck.main.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiechaokang
 * @date 2020/10/12
 */
@Component
@FeignClient(value = "HYSTRIX-SERVICE",fallback = HystrixFeinServiceImpl.class)
public interface HystrixFeinService {

    @RequestMapping("/hystrix/ok")
    String ok();

    @RequestMapping("/hystrix/timeOut")
    String timeOut();

}
