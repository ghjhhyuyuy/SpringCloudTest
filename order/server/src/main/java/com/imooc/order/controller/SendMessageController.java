package com.imooc.order.controller;

import com.imooc.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by wzw on 2019/2/20
 *
 * @Author wzw
 */
@RestController
public class SendMessageController {
    @Autowired
    private StreamClient streamClient;
    @GetMapping("/sendMessage")
    public void process(){
        String message = "now" + new Date();
        streamClient.output().send(MessageBuilder.withPayload(message).build());
    }
}
