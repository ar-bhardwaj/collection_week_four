package com.reflection.advanced.di;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Inject dependencies using the DI container
        DIContainer.injectDependencies(userService);

        // Use the service after injection
        userService.performAction();
    }
}

