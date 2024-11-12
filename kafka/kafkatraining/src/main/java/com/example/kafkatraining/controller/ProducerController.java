package com.example.kafkatraining.controller;

import com.example.kafkatraining.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1")
public class ProducerController {

    @Autowired
    private KafkaProducer kafkaProducerService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
        return "Message sent to Kafka";
    }
}
