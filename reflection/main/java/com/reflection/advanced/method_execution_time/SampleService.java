package com.reflection.advanced.method_execution_time;

public class SampleService {

    public void fastMethod() {
        System.out.println("Fast method executed.");
    }

    public void slowMethod() {
        try {
            Thread.sleep(100);  // Simulating a slower operation
            System.out.println("Slow method executed.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void privateMethod() {
        System.out.println("Private method executed.");
    }
}
