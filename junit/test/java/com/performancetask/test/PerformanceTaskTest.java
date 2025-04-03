package com.performancetask.test;

import static org.junit.jupiter.api.Assertions.*;

import com.performancetask.PerformanceTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

class PerformanceTaskTest {
    private final PerformanceTask performanceTask = new PerformanceTask();

    // Test should fail if execution exceeds 2 seconds
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTask() throws InterruptedException {
        performanceTask.longRunningTask();
    }
}
