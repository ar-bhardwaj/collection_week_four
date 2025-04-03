package com.calculator.test;

// CalculatorTest.java
import static org.junit.jupiter.api.Assertions.*;

import com.calculator.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    // Test for addition
    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    // Test for subtraction
    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    // Test for multiplication
    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    // Test for division
    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    // Test for division by zero
    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

