package com.janwes.kafka.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.kafka.consumer
 * @date 2021/9/2 14:37
 * @description 自定义消息接收器
 */
public interface MqSink {
    String INPUT = "my-input";

    /**
     * 通过@Input注解自定义消息输入通道
     *
     * @return
     */
    @Input("my-input")
    SubscribableChannel input();
}
