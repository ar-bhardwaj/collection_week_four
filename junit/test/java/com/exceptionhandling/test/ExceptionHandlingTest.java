package com.exceptionhandling.test;// ExceptionHandlingTest.java
import static org.junit.jupiter.api.Assertions.*;

import com.exceptionhandling.ExceptionHandling;
import org.junit.jupiter.api.Test;

class ExceptionHandlingTest {
    private final ExceptionHandling exceptionHandling = new ExceptionHandling();

    // Test to check if exception is thrown properly
    @Test
    void testDivideByZeroException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> exceptionHandling.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
