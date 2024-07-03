package com.hcltech.productservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "products")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@NamedQueries(
        {
                @NamedQuery(name = "Product.findByName", query = "SELECT p FROM products p WHERE p.productName = :productName")
        }
)
public class Product {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String productName;
    private String productCategory;
    private long price;
}
