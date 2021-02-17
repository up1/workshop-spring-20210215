package com.example.workshop.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsersControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void success_getAllUsers() {
        // Call API
        List<UserResponse> response
                = restTemplate.getForObject("/users", List.class);
        // Assert / validate
        assertEquals(2, response.size());

        UserResponse expected = new UserResponse(1,"demo 1", 30);
        assertEquals(expected, response.get(0));
    }
}