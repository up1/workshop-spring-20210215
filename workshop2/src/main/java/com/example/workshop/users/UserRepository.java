package com.example.workshop.users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository
        extends JpaRepository<User, Integer> {
    //Select * from User where name=?
    Optional<User> findByName(String name);
}
