package com.janwes.kafka.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.kafka.source
 * @date 2021/9/2 10:43
 * @description 自定义发射器source
 */
public interface MqSource {

    String OUTPUT = "my-output";

    /**
     * 通过@Output注解自定义消息输出通道
     *
     * @return
     */
    @Output("my-output")
    MessageChannel output();
}
