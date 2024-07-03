package com.hcltech.productservice.service;

public class NoSuchProductFoundException extends RuntimeException{

    public NoSuchProductFoundException() {
        super("No Product found");
    }
}
