package com.example.workshop;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HelloControllerHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<HelloResponse> notFound( RuntimeException e ) {
        HelloResponse response = new HelloResponse(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
