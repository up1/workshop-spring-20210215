package com.example.workshop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class HelloRepositoryTest {

    @Autowired
    private HelloRepository helloRepository;

    @Test
    public void xxx() {
        // Prepare data for testing
        Hello data = new Hello();
        data.setId(1);
        data.setMessage("Hello World");
        helloRepository.save(data);

        // Testing
        Optional<Hello> hello = helloRepository.findById(1);
        assertTrue(hello.isPresent());
        assertEquals("Hello World", hello.get().getMessage());
    }


}