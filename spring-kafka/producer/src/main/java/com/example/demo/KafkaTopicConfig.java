package com.example.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic createMyTopic(){
        return new NewTopic("my-new-topic", 3, (short) 1);
    }
}


// You can create a new topic using spring boot also
