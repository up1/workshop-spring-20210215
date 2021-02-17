package com.example.workshop.users;

public class NameDuplicateException extends RuntimeException {
    public NameDuplicateException(String message) {
        super(message);
    }
}
