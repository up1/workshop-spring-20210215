package com.example.workshop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloController2Test {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private HelloRepository helloRepository;

    @Test
    public void success_with_hello_2() {
        // Prepare data for testing
        Hello data = new Hello();
        data.setId(1);
        data.setMessage("Hello World");
        helloRepository.save(data);

        // Testing
        HelloResponse result
                = restTemplate.getForObject("/hello", HelloResponse.class);
        assertEquals("Hello World", result.getMessage());
    }

}