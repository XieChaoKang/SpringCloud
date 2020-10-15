package com.xck.main.service.impl;

import cn.hutool.core.util.IdUtil;
import com.xck.main.service.IProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @author xiechaokang
 * @date 2020/10/15
 */
@EnableBinding(Source.class) //定义消息的推送管道
public class IProviderServiceImpl implements IProviderService {

    /**消息发送管道
     * output 这个命名不可更改 否则会自动装配 MessageChannel 时会
     * expected single matching bean but found 3: output,nullChannel,errorChannel
     * 从而造成自动转配失败
     * 因为output是在Source类中定义好的
     * */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String uuid = IdUtil.simpleUUID();
        boolean send = output.send(MessageBuilder.withPayload(uuid).build());
        if (send) {
            System.out.println("消息发送成功："+uuid);
        }
        return null;
    }
}
