package com.fullstack.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {

    @KafkaListener(topics = "kafka.topic.name", groupId = "spring.kafka.consumer.group-id")
    public void listen(ConsumerRecord record) {
        log.info("Consumer Message: " + record.value());
    }
}
