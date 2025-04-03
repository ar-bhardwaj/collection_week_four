package com.iseven.test;

// IsEvenTest.java
import static org.junit.jupiter.api.Assertions.*;

import com.iseven.IsEven;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class IsEvenTest {
    private final IsEven isEvenChecker = new IsEven();

    // Parameterized test for even numbers
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEvenWithEvenNumbers(int number) {
        assertTrue(isEvenChecker.isEven(number));
    }

    // Parameterized test for odd numbers
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testIsEvenWithOddNumbers(int number) {
        assertFalse(isEvenChecker.isEven(number));
    }
}
