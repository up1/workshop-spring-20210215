package com.example.workshop;

import java.util.Random;

public class GenerateUUIDService {

    private MyRandom random;

    public void setRandom(MyRandom random) {
        this.random = random;
    }

    public String getData(MyRandom random) {
        String result = "SOMKIAT";
        int number = random.nextInt(9);
        return result + number;
    }

}
