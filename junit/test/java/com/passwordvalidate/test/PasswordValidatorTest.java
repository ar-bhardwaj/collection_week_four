package com.passwordvalidate.test;

// PasswordValidatorTest.java
import static org.junit.jupiter.api.Assertions.*;

import com.passwordvalidate.PasswordValidator;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValidPassword("StrongP@ss1"));
    }

    @Test
    void testShortPassword() {
        assertFalse(validator.isValidPassword("Short1"));
    }

    @Test
    void testNoUpperCase() {
        assertFalse(validator.isValidPassword("weakpassword1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValidPassword("NoDigitHere"));
    }
}
