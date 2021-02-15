package com.example.workshop;

public class BuzzBusinessRule implements BusinessRule {
    public boolean validate(int input) {
        return input % 5 == 0;
    }

    public String speak() {
        return "Buzz";
    }
}
