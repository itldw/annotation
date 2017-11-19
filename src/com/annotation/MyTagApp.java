package com.annotation;

import java.lang.annotation.Annotation;

public class MyTagApp {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Annotation[] annotations=Class.forName("com.annotation.MyClass").getMethod("info").getAnnotations();
		
		for(Annotation annotation:annotations) {
			
			System.out.println(annotation);
		}
	}

}
