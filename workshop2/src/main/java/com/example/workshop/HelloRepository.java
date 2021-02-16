package com.example.workshop;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository
        extends JpaRepository<Hello,Integer> {
}
