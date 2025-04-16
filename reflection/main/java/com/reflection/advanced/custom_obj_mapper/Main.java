package com.reflection.advanced.custom_obj_mapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> personData = new HashMap<>();
        personData.put("name", "Alice");
        personData.put("age", 25);
        personData.put("city", "San Francisco");

        Person person = ObjectMapper.toObject(Person.class, personData);

        System.out.println("Mapped Person Object:");
        System.out.println(person);
    }
}

