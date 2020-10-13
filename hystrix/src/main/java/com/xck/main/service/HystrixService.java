package com.xck.main.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * @author xiechaokang
 * @date 2020/10/12
 */
@Service
@Slf4j
public class HystrixService {

    public String ok(){
        return "线程："+Thread.currentThread().getName()+"哈哈哈哈哈哈";
    }

    /**假设出现服务出问题的情况（假设服务响应时间超过两秒或者服务直接崩溃就相当于服务出现故障） 进行服务降级 */
    @HystrixCommand(fallbackMethod = "fall",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
    })
    public String timeOut(){
        int time = 3000;
        //模拟服务直接崩溃
        //int sum = 10/0;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("jinn");
        return "线程："+Thread.currentThread().getName()+"睡了%s"+time+"秒";
    }

    @HystrixCommand(fallbackMethod = "fall",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.interruptOnTimeout", value="true"), //是否开启断路器 相当于是否要熔断
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50") //失败率达到多少后跳闸
    })
    public String fuSing(int id){
        if (id < 0){
            throw new RuntimeException("*****id不能为负数");
        }
        return "流水号："+IdUtil.simpleUUID();
    }

    /**
     * 兜底方法 服务过多时 进行服务降级 调用该方法给那些砍掉的服务一些提示或是别的处理方式
     * */
    public String fallBack(){
        return "请求过多，服务进行降级，调用兜底方法";
    }

    public String fall(int id){
        return "服务熔断"+id;
    }
}
