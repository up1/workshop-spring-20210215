package com.example.workshop;

public interface BusinessRule {
    boolean validate(int input);
    String speak() ;
}
