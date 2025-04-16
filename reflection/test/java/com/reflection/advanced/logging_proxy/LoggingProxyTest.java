package com.reflection.advanced.logging_proxy;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.reflection.advanced.logging_proxy.Greeting;
import com.reflection.advanced.logging_proxy.GreetingImpl;
import com.reflection.advanced.logging_proxy.ProxyFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LoggingProxyTest {

    @Test
    public void testLoggingProxy() {
        // Capture the output stream to verify the logs
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create the original object
        Greeting greeting = new GreetingImpl();

        // Create a proxy for the Greeting interface
        Greeting proxy = ProxyFactory.createProxy(Greeting.class, greeting);

        // Use the proxy object
        proxy.sayHello("Alice");
        proxy.sayGoodbye("Bob");

        // Convert captured output to string
        String output = outContent.toString();

        // Restore the original System.out
        System.setOut(System.out);

        // Assertions
        assertTrue(output.contains("Invoking method: sayHello"));
        assertTrue(output.contains("Hello, Alice!"));
        assertTrue(output.contains("Method sayHello executed successfully."));

        assertTrue(output.contains("Invoking method: sayGoodbye"));
        assertTrue(output.contains("Goodbye, Bob!"));
        assertTrue(output.contains("Method sayGoodbye executed successfully."));
        
        // Additional assertions for method names
        assertEquals(true, output.contains("sayHello"));
        assertEquals(true, output.contains("sayGoodbye"));
    }
}
