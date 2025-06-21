package com.example.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message)
    {
        kafkaTemplate.send("my-topic", message);
        return "Message sent";
    }
}
