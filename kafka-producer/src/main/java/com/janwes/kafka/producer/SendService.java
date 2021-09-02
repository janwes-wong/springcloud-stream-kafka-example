package com.janwes.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.kafka.producer
 * @date 2021/8/30 17:42
 * @description
 */
@EnableBinding(Source.class) // 该注解用于绑定通道 output
public class SendService {

    @Autowired
    private Source source;

    /**
     * 发送消息
     *
     * @param message 消息内容
     */
    public void sendMessage(String message) {
        source.output().send(MessageBuilder.withPayload(message).build());
    }
}
