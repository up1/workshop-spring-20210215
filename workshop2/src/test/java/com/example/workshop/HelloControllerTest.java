package com.example.workshop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private HelloService helloService;

    @Test
    public void success_with_hello() {
        // Stubbing
        given(helloService.getData()).willReturn("Hello World");

        HelloResponse result
                = restTemplate.getForObject("/hello", HelloResponse.class);
        assertEquals("Hello World", result.getMessage());
    }

}