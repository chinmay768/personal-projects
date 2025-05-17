package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {


//    @KafkaListener(topics = "my-topic-new", groupId = "my-group-new")
//    public void listen(String message) {
//        System.out.println("Received Messages1: " + message);
//    }
//
//    @KafkaListener(topics = "my-topic-new", groupId = "my-group-new2")
//    public void listen2(String message) {
//        System.out.println("Received Messages2: " + message);
//    }

    @KafkaListener(topics = "my-topic-new", groupId = "my-group-new3")
    public void listenRiderLocation(RiderLocation riderLocation) {
        System.out.println("Received Location: " + riderLocation.getRiderId());
    }
}
// Note
// If all the consumers are listening to the same topic and have same groupId then only one
// of them will be able to consume the produced message

//docker exec -it kafka bash
//  kafka-console-consumer --topic my-topic --bootstrap-server localhost:9092 --group my-group --from-beginning
// kafka-topics --list --bootstrap-server localhost:9092

// If producer uses a topic which is not present then that topic will be created automatically
// auto.create.topics.enable = true (This is required to create topics automatically)

