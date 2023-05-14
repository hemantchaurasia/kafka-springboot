package com.digimarvel.kafka.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/send")
    public String sendMessage() {
        kafkaProducer.sendMessage("test-topic", "Hello Kafka");
        return "Message sent successfully";
    }
}

