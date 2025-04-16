package com.reflection.intermediate.access_modify_static_field;

public class Configuration {
    // Private static field
    private static String API_KEY = "DEFAULT_KEY";

    // Getter method to print the API_KEY
    public static void printApiKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}

