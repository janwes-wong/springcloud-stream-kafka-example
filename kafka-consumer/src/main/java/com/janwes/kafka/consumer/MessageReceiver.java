package com.janwes.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.kafka.consumer
 * @date 2021/9/2 14:38
 * @description
 */
@Slf4j
@EnableBinding(MqSink.class)
public class MessageReceiver {

    @StreamListener(MqSink.INPUT)
    public void receiveMsg(Object payload) {
        log.info(">>> receive message:{}", payload);
    }
}
