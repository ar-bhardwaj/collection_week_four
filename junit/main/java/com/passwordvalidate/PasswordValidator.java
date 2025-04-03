package com.passwordvalidate;

// PasswordValidator.java
public class PasswordValidator {
    // Method to check if a password is strong
    public boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*\\d.*")) return false;
        return true;
    }
}

