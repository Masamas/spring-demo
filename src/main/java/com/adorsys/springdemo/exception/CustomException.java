package com.adorsys.springdemo.exception;

public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }
}
