package com.example.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GenerateUUIDService {

    @Autowired
    private MyRandom random;

    public String getData() {
        String result = "SOMKIAT";
        int number = random.nextInt(9);
        return result + number;
    }

    public String getData(MyRandom random) {
        String result = "SOMKIAT";
        int number = random.nextInt(9);
        return result + number;
    }

}
