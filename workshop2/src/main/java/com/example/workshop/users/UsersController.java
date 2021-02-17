package com.example.workshop.users;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    @GetMapping("/users")
    public List<UserResponse> getAllUsers() {
        List<UserResponse> userResponseList = new ArrayList<>();
        userResponseList.add(new UserResponse(1,"demo 1", 30));
        userResponseList.add(new UserResponse(2,"demo 2", 35));
        return userResponseList;
    }

    @GetMapping("/users2")
    public ResponseEntity<List<UserResponse>> getAllUsers2() {
        List<UserResponse> userResponseList = new ArrayList<>();
        userResponseList.add(new UserResponse(1,"demo 1", 30));
        userResponseList.add(new UserResponse(2,"demo 2", 35));
        return new ResponseEntity<>(userResponseList, HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public UserResponse getUserById(@PathVariable int id) {
        UserResponse userResponse = new UserResponse(id, "Demo", 40);
        return userResponse;
    }

}
