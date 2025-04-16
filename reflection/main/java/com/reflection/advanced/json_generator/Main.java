package com.reflection.advanced.json_generator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30, true);
        String json = JSONUtil.toJson(person);
        System.out.println("JSON Representation: " + json);
    }
}
