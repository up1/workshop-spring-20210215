package com.example.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    public String getData() {
        Optional<Hello> hello = helloRepository.findById(1);
        if(!hello.isPresent()) {
            throw new RuntimeException("Data not found with id=1");
        }
        return hello.get().getMessage();
    }
}
