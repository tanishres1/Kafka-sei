package com.kafka.org.service;

import com.kafka.org.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "test", groupId = "user-group")
    public void consume(User user) {
        System.out.println("Consumed message: " + user.getName() + ", Age: " + user.getAge());
    }
}
