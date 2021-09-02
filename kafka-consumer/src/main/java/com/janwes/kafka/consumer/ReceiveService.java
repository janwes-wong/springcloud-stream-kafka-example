package com.janwes.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.kafka.consumer
 * @date 2021/8/30 17:56
 * @description
 */
@Slf4j
@EnableBinding(Sink.class) // 该注解用于绑定通道 input
public class ReceiveService {

    @StreamListener(Sink.INPUT)
    public void receiveMsg(Object payload) {
        log.info(">>> receive message:{}", payload);
    }
}
