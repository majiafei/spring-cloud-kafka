package com.example.springcloudkafka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Auther: majiafei
 * @Date: 2018/12/16 17:23
 * @Description:
 */
@RestController
public class KafkaProducerController {

    public final  KafkaTemplate kafkaTemplate;

    private final String topic;

    public KafkaProducerController(KafkaTemplate kafkaTemplate, @Value("${kafka.topic}")String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    @GetMapping("/message/{id}")
    public String send(@PathVariable("id") Integer id) {
        kafkaTemplate.send(topic, "hello");

        return "OK";
    }

}
