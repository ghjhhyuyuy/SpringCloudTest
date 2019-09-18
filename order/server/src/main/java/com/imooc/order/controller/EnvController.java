package com.imooc.order.controller;

import com.imooc.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by 廖师兄
 * 2018-01-21 21:57
 */
@RestController
@RequestMapping("/env")
public class EnvController {
    @Autowired
    private StreamClient streamClient;
    @GetMapping("/sendMessage")
    public void process(){
        String message = "now" + new Date();
        streamClient.output().send(MessageBuilder.withPayload(message).build());
    }

    @Value("${env}")
    private String env;

    @GetMapping("/print")
    private String print() {
        return env;
    }
}
