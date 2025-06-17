package com.kafka.org.service;

import com.kafka.org.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static final String TOPIC = "test";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    public String sendMessage(User user) {
        kafkaTemplate.send(TOPIC, user);
        return "Message sent to Kafka successfully!";
    }
}
