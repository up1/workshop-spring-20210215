package com.example.workshop;

public class HeyBusinessRule implements BusinessRule {
    @Override
    public boolean validate(int input) {
        return input % 7 == 0;
    }

    @Override
    public String speak() {
        return "Hey";
    }
}
