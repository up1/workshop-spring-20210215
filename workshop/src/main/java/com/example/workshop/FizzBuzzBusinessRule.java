package com.example.workshop;

public class FizzBuzzBusinessRule implements BusinessRule {
    public boolean validate(int input) {
        return input % 15 == 0;
    }

    public String speak() {
        return "FizzBuzz";
    }
}
