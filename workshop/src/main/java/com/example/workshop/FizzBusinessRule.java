package com.example.workshop;

public class FizzBusinessRule implements BusinessRule {
    public boolean validate(int input) {
        return input % 3 == 0;
    }

    public String speak() {
        return "Fizz";
    }
}
