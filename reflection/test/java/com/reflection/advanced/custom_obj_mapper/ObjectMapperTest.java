package com.reflection.advanced.custom_obj_mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.reflection.advanced.custom_obj_mapper.ObjectMapper;
import com.reflection.advanced.custom_obj_mapper.Person;

public class ObjectMapperTest {

    @Test
    public void testToObject() {
        Map<String, Object> personData = new HashMap<>();
        personData.put("name", "John Doe");
        personData.put("age", 30);
        personData.put("city", "New York");

        Person person = ObjectMapper.toObject(Person.class, personData);

        assertNotNull(person);
        assertEquals("John Doe", person.getName());
        assertEquals(30, person.getAge());
        assertEquals("New York", person.getCity());

        System.out.println(person);
    }
}

