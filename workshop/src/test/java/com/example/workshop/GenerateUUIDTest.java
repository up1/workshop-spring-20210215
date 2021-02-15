package com.example.workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Random9 implements MyRandom {
    @Override
    public int nextInt(int bound) {
        return 9;
    }
}

public class GenerateUUIDTest {
    @Test
    @DisplayName("เรากำลังจะทดสอบการ generate UUID โดยผลที่ได้" +
            "ต้องได้ข้อมูลเป็น string ต่อด้วยตัวเลข 0-9")
    public void success() {
        // Arrange
        MyRandom random = new Random9();
        // 1. Constructor Injection
        GenerateUUIDService service
                = new GenerateUUIDService();
        // 3. Setter Injection
//        service.setRandom(random);
        // Act
        // 2. Method Injection
        String result = service.getData(random);
        // Assert/ Checking
        assertEquals("SOMKIAT9", result);
    }
}
