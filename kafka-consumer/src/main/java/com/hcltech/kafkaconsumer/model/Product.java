package com.hcltech.kafkaconsumer.model;

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
