package com.javashastra.controller;

import com.javashastra.producer.KafkaMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @Autowired
    KafkaMessageProducer kafkaMessageProducer;

    @PostMapping("/publish")
    public String sendMessage(@RequestParam("message") String messageBody) {
        kafkaMessageProducer.pushMessage(messageBody);
        return "Message Published";

    }
}
