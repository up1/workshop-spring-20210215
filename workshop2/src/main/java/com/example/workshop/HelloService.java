package com.example.workshop;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getData() {
        return "Hello World";
    }
}
