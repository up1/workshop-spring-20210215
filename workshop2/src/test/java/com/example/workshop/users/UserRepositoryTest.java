package com.example.workshop.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void found_user_by_name_somkiat() {
        // Prepare data
        User somkiat = new User();
        somkiat.setName("somkiat");
        somkiat.setAge(40);
        userRepository.save(somkiat);
        // Validate
        Optional<User> user = userRepository.findByName("somkiat");
        assertTrue(user.isPresent());
    }

    @Test
    public void not_found_user_by_name_somkiat() {
        // Validate
        Optional<User> user = userRepository.findByName("somkiat");
        assertFalse(user.isPresent());
    }

}