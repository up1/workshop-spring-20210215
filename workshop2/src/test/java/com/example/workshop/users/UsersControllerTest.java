package com.example.workshop.users;

import com.example.workshop.HelloResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsersControllerTest extends Object {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void success_getAllUsers() {
        // Call API
        List<LinkedHashMap> response
                = restTemplate.getForObject("/users", List.class);
        // Assert / validate
        assertEquals(2, response.size());
        UserResponse expected = new UserResponse(1, "demo 1", 30);
        UserResponse result = new UserResponse(Integer.valueOf(response.get(0).get("id").toString()),
                response.get(0).get("name").toString(),
                Integer.valueOf(response.get(0).get("age").toString()));
        assertEquals(expected, result);
    }

    @Test
    public void success_get_user_by_id() {
        // Call API
        UserResponse response
                = restTemplate.getForObject("/users/1", UserResponse.class);
        // Assert / validate
        UserResponse expected = new UserResponse(1, "Demo", 40);
        assertEquals(expected, response);
    }

    @Test
    public void invalid_id_with_get_user_by_id() {
        // Call API
        HelloResponse response
                = restTemplate.getForObject("/users/invalid", HelloResponse.class);
        // Assert / validate
        assertEquals("Input invalid", response.getMessage());
    }
}