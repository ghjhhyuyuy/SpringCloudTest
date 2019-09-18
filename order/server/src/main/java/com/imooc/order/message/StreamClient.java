package com.imooc.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by wzw on 2019/2/20
 *
 * @Author wzw
 */
public interface StreamClient {
    String INPUT = "myMessage";
    @Input(StreamClient.INPUT)
    SubscribableChannel input();

    @Output(StreamClient.INPUT)
    MessageChannel output();
}
