package com.kafka.org.controller;

import com.kafka.org.model.User;
import com.kafka.org.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/send")
    public String sendUser(@RequestBody User user) {
        return producerService.sendMessage(user);
    }

}
