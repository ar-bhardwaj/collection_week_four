package com.exceptionhandling;
// ExceptionHandling.java
public class ExceptionHandling {
    // Method that throws ArithmeticException when dividing by zero
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
