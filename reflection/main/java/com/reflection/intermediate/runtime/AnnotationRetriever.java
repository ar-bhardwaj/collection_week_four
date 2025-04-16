package com.reflection.intermediate.runtime;

import java.lang.annotation.Annotation;

public class AnnotationRetriever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class<?>cls = Class.forName("com.reflection.intermediate.runtime.MyClassAnnotation");
			if(cls.isAnnotationPresent(Author.class)) {
				Annotation annotation = cls.getAnnotation(Author.class);
				Author author = (Author)annotation;
				System.out.print("Name of the author is :"+author.name());
			}
			else {
				System.out.print("No author present");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
