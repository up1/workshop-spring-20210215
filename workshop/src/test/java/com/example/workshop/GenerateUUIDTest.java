package com.example.workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateUUIDTest {
    @Test
    @DisplayName("เรากำลังจะทดสอบการ generate UUID โดยผลที่ได้" +
            "ต้องได้ข้อมูลเป็น string ต่อด้วยตัวเลข 0-9")
    public void success() {
        // Arrange
        GenerateUUIDService service = new GenerateUUIDService();
        // Act
        String result = service.getData();
        // Assert/ Checking
        assertEquals("SOMKIAT9", result);
    }
}
