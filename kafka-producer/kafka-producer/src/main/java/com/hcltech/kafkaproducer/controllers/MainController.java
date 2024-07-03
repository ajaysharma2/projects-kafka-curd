package com.hcltech.kafkaproducer.controllers;

import com.hcltech.kafkaproducer.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    KafkaTemplate<String, Product> kafkaTemplate;

    private static final String TOPIC = "NewTopic";

    @Autowired
    public void setKafkaTemplate(KafkaTemplate<String, Product> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    /*@GetMapping("/publish/{message}")
    public String publiceMessage(@PathVariable String message) {
        //This is simple string publish
       // kafkaTemplate.send(TOPIC, message);

        return "Message published";
    }*/

    @PostMapping("/publish")
    public String publiceProduct(@RequestBody Product product) {
        kafkaTemplate.send(TOPIC, product);

        return "Message published";
    }

}
