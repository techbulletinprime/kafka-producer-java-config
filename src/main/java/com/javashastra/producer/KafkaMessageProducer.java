package com.javashastra.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageProducer {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public void pushMessage(String message) {
        kafkaTemplate.send("quickstart-events", message);


    }
}
