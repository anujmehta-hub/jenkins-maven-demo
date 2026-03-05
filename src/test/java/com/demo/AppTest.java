package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAppGreeting() {
        App app = new App();
        String message = app.getGreeting();
        assertEquals("Hello from Jenkins CI VM!", message);
    }
}
