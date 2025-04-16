package com.reflection.advanced.logging_proxy;

public class LoggingProxyDemo {
    public static void main(String[] args) {
        // Create the original object
        Greeting greeting = new GreetingImpl();

        // Create a proxy for the Greeting interface
        Greeting proxy = ProxyFactory.createProxy(Greeting.class, greeting);

        // Use the proxy object
        proxy.sayHello("Alice");
        proxy.sayGoodbye("Bob");
    }
}
