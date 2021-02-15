package com.example.workshop;

import org.springframework.stereotype.Component;

@Component
public class SomkiatRandom implements MyRandom {
    @Override
    public int nextInt(int bound) {
        return -1;
    }
}
