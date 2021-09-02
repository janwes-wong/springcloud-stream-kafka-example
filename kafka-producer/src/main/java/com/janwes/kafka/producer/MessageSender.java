package com.janwes.kafka.producer;

import com.janwes.kafka.source.MqSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.kafka.producer
 * @date 2021/9/2 14:28
 * @description
 */
@EnableBinding(MqSource.class)
public class MessageSender {

    @Autowired
    private MqSource mqSource;

    /**
     * 发送消息
     *
     * @param message 消息内容
     */
    public void sendMessage(String message) {
        mqSource.output().send(MessageBuilder.withPayload(message).build());
    }
}
