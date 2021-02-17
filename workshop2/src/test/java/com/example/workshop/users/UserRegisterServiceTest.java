package com.example.workshop.users;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserRegisterServiceTest {

    @Autowired
    private UserRegisterService userRegisterService;

    @Autowired
    private UserRepository userRepository;

    @AfterEach
    public void clearData() {
        userRepository.deleteAll();
    }

    @Test
    public void success_register() {
        // Request for create a new user
        UserRequest userRequest = new UserRequest();
        userRequest.setName("demo");
        userRequest.setAge(40);
        // Call register process
        User newUser = userRegisterService.register(userRequest);

        // Assert / validate result
        User expected = new User();
        expected.setId(1);
        expected.setName("demo");
        expected.setAge(40);
        assertEquals(expected, newUser);
    }

    @Test
    public void failure_with_duplicate_name_of_register() {
        // Prepare data
        User somkiat = new User();
        somkiat.setName("demo");
        somkiat.setAge(40);
        userRepository.save(somkiat);

        // Request for create a new user
        UserRequest userRequest = new UserRequest();
        userRequest.setName("demo");
        userRequest.setAge(40);

        // Call register process
        Exception exception = assertThrows(NameDuplicateException.class, () -> {
            userRegisterService.register(userRequest);
        });

        assertNotNull(exception);
        assertEquals("Duplicated with username=demo", exception.getMessage());

    }
}