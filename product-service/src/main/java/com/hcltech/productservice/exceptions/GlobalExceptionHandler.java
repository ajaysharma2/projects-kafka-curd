package com.hcltech.productservice.exceptions;

import com.hcltech.productservice.service.NoSuchProductFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchProductFoundException.class)
    public String handleNoSuchProductFoundException(RuntimeException runtimeException) {
        return runtimeException.getMessage();
    }
}
