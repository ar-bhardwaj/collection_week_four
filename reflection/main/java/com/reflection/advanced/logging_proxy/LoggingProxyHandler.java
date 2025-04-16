package com.reflection.advanced.logging_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log method name before execution
        System.out.println("Invoking method: " + method.getName());
        
        // Execute the actual method
        Object result = method.invoke(target, args);
        
        System.out.println("Method " + method.getName() + " executed successfully.");
        return result;
    }
}
