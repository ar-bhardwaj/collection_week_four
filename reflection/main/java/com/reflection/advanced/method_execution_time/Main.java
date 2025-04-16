package com.reflection.advanced.method_execution_time;


public class Main {
    public static void main(String[] args) {
        SampleService sampleService = new SampleService();

        // Measure the execution time of all methods
        MethodTimingUtil.measureMethodExecutionTime(sampleService);
    }
}
