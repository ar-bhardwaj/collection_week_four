package com.stringutils;

// StringUtils.java
public class StringUtils {
    // Method to reverse a string
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Method to convert a string to uppercase
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
