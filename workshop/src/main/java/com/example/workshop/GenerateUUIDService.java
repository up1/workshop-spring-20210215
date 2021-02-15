package com.example.workshop;

import java.util.Random;

public class GenerateUUIDService {

    public String getData() {
        String result = "SOMKIAT";
        Random random = new Random();
        int number = random.nextInt(9);
        return result + number;
    }

}
