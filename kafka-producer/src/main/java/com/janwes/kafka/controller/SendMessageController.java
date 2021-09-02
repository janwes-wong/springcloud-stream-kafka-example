package com.janwes.kafka.controller;

import com.janwes.kafka.producer.MessageSender;
import com.janwes.kafka.producer.SendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.kafka.controller
 * @date 2021/8/30 17:50
 * @description
 */
@Slf4j
@RestController
@RequestMapping("/send")
public class SendMessageController {

    @Autowired
    private SendService sendService;

    @Autowired
    private MessageSender messageSender;

    @GetMapping("/msg/{msgContent}")
    public void sendMsg(@PathVariable("msgContent") String msgContent) {
        sendService.sendMessage(msgContent);
        log.info(">>> send message success......");
    }

    @GetMapping("/message/{msgContent}")
    public void sendMessage(@PathVariable("msgContent") String msgContent) {
        messageSender.sendMessage(msgContent);
        log.info(">>> send message success......");
    }
}
