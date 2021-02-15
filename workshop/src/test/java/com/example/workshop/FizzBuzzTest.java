package com.example.workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("นับ 1 ได้ 1")
    public void case_1() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(1);
        assertEquals("1", result);
    }
}
