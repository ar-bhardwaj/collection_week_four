package com.reflection.advanced.method_execution_time;


import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.reflection.advanced.method_execution_time.MethodTimingUtil;
import com.reflection.advanced.method_execution_time.SampleService;

public class MethodTimingUtilTest {

    @Test
    public void testMethodExecution() {
        // Capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Create an instance of SampleService and measure method execution time
        SampleService sampleService = new SampleService();
        MethodTimingUtil.measureMethodExecutionTime(sampleService);

        // Restore the original system output
        System.setOut(originalOut);

        // Convert the output to a string
        String output = outputStream.toString();

        // Check if the output contains expected method execution messages
        assertTrue(output.contains("Fast method executed."));
        assertTrue(output.contains("Slow method executed."));
        assertTrue(output.contains("Private method executed."));
    }

    @Test
    public void testMethodTimingOutput() {
        // Capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Create an instance of SampleService and measure method execution time
        SampleService sampleService = new SampleService();
        MethodTimingUtil.measureMethodExecutionTime(sampleService);

        // Restore the original system output
        System.setOut(originalOut);

        // Convert the output to a string
        String output = outputStream.toString();

        // Check if the output contains execution time information
        assertTrue(output.contains("executed in"));
    }
}

