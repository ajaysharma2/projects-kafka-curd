package com.hcltech.productservice.service;

import com.hcltech.productservice.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<Product> getProductByName(long id);

    Product createProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    Product updateProduct(Product product);
    void deleteProduct(Long id);
}