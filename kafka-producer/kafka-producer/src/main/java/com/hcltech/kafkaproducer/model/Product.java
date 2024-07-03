package com.hcltech.kafkaproducer.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    private String productId;
    private String productName;
}
