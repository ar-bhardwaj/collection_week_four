package com.stringutil.test;

// StringUtilsTest.java
import static org.junit.jupiter.api.Assertions.*;

import com.stringutils.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();

    // Test for reversing a string
    @Test
    void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    // Test for checking palindrome
    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    // Test for converting string to uppercase
    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }
}
