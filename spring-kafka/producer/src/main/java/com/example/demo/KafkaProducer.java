package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    // Instead of construction injection used autowire
    @Autowired
    private KafkaTemplate<String, RiderLocation> kafkaTemplate;


    @PostMapping("/send")
    public String sendMessage(@RequestParam String message){
        RiderLocation riderLocation = new RiderLocation(323.00, 111.00, "ID12323");

//        kafkaTemplate.send("my-new-topic", riderLocation); We can't send objects directly without serializing
        kafkaTemplate.send("my-topic-new", riderLocation);
        return "Message sent: " + riderLocation.getRiderId();
    }

}
//spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
//spring.kafka.producer.value-serializer=org.springframework.kafka.support.serializer.JsonSerializer