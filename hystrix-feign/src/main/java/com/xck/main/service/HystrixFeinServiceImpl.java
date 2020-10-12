package com.xck.main.service;

import org.springframework.stereotype.Component;

/**
 * @author xiechaokang
 * @date 2020/10/12
 */
@Component
public class HystrixFeinServiceImpl implements HystrixFeinService {
    @Override
    public String ok() {
        return "null 独立兜底方法类 减少代码上的耦合  OK";
    }

    @Override
    public String timeOut() {
        return "null 独立兜底方法类 减少代码上的耦合 timeOut";
    }
}
