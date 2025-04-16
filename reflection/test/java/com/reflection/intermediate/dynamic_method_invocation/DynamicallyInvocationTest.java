package com.reflection.intermediate.dynamic_method_invocation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.lang.reflect.Method;

import org.junit.Test;

import com.reflection.intermediate.dynamic_method_invocation.MathOperation;

public class DynamicallyInvocationTest {
	//testing normally addition method
	@Test
	public void addTest() {
		assertEquals(5,MathOperation.add(3, 2));
		assertNotEquals(2,MathOperation.add(1, 2));
	}
	
	//testing dynamically subtraction
	@Test
	public void multiplyTest() {
		try {
			Class<?>cls = MathOperation.class;
			Method method = cls.getMethod("multiply", int.class,int.class) ;
			int result = (int)method.invoke(null,6,7);
			assertEquals(42,result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		@Test
		public void subtractTest() {
			try {
				Class<?>cls = MathOperation.class;
				Method method = cls.getMethod("subtract", int.class,int.class) ;
				int result = (int)method.invoke(null,16,7);
				assertEquals(9,result);
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
