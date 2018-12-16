package com.example.springcloudkafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: majiafei
 * @Date: 2018/12/16 17:40
 * @Description:
 */
@Component
public class ConsumerMessageListener{

    @KafkaListener(topics = "${kafka.topic}")
    public void  getMessage(String message) {
        System.out.println(message + "==================================");
    }

}
