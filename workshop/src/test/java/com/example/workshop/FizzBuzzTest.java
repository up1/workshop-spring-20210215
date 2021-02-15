package com.example.workshop;

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
    @Test
    @DisplayName("นับ 2 ได้ 2")
    public void case_2() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(2);
        assertEquals("2", result);
    }
    @Test
    @DisplayName("นับ 3 ได้ Fizz")
    public void case_3() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(3);
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("นับ 4 ได้ 4")
    public void case_4() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(4);
        assertEquals("4", result);
    }

    @Test
    @DisplayName("นับ 5 ได้ Buzz")
    public void case_5() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(5);
        assertEquals("Buzz", result);
    }
    @Test
    @DisplayName("นับ 6 ได้ Fizz")
    public void case_6() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(6);
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("นับ 7 ได้ Hey")
    public void case_7() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(7);
        assertEquals("Hey", result);
    }

    @Test
    @DisplayName("นับ 8 ได้ 8")
    public void case_8() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(8);
        assertEquals("8", result);
    }
    @Test
    @DisplayName("นับ 9 ได้ Fizz")
    public void case_9() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(9);
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("นับ 10 ได้ Buzz")
    public void case_10() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(10);
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("นับ 12 ได้ Fizz")
    public void case_12() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(12);
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("นับ 15 ได้ FizzBuzz")
    public void case_15() {
        FizzBuzz fb = new FizzBuzz();
        String result = fb.speakBy(15);
        assertEquals("FizzBuzz", result);
    }
}
