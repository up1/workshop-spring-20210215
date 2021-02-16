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

    @Test
    public void success_with_hello_2() {
        HelloResponse result
                = restTemplate.getForObject("/hello", HelloResponse.class);
        assertEquals("Hello World", result.getMessage());
    }

}