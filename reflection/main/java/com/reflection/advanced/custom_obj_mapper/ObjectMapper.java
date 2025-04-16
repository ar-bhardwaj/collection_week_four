package com.reflection.advanced.custom_obj_mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
	//<T> it's a generic type which tell the compiler what type is
	//T acutal return type
	public static <T> T toObject(Class<T>cls,Map<String,Object>prop){
		try {
		//create a new instance of given class
		T instance = cls.getDeclaredConstructor().newInstance(null);
		
		 // Iterate through the map and set field values
        for (Map.Entry<String, Object> entry : prop.entrySet()) {
            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();

            // Get the field by name
            Field field = cls.getDeclaredField(fieldName);
            field.setAccessible(true);  // Make private fields accessible

            // Set the value to the field
            field.set(instance, fieldValue);
        }

        return instance;
		}
        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to map properties to object: " + e.getMessage());
        }
	}
}
