package com.xck.main.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author xiechaokang
 * @date 2020/10/15
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveController {

    @Value("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    public void receive(Message<String> message){
        System.out.println("接收到消息："+message.getPayload()+"\t"+port);
    }
}
