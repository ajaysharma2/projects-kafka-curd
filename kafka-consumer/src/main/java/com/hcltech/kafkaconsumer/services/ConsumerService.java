package com.hcltech.kafkaconsumer.services;

import com.hcltech.kafkaconsumer.model.Product;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = {"NewTopic"}, groupId = "g1", containerFactory = "productListner")
    public void consumeProducts(Product product) {
        System.out.println("Product received : " + product.toString());

    }
}
