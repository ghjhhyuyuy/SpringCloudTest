package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * Created by wzw on 2019/2/20
 *
 * @Author wzw
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {
    @StreamListener(StreamClient.INPUT)
    public void process(Object message){
        log.info("StreamReceiver:{}",message);
    }
}
