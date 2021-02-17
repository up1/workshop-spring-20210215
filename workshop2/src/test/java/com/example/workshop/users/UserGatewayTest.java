package com.example.workshop.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserGatewayTest {

    @Autowired
    private UserGateway userGateway;

    @Test
    public void found_with_user_1() {
        Optional<UserXResponse> user = userGateway.getUserById(1);
        assertEquals(1, user.get().getId());
        assertEquals("Leanne Graham", user.get().getName());
    }

    @Test
    public void not_found_with_user_100() {
        Optional<UserXResponse> user = userGateway.getUserById(100);
        assertFalse(user.isPresent());
    }
}