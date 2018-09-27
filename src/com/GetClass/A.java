package com.GetClass;

public class A {
	
	static void m1(Object obj) {
		String name= obj.getClass().getName();
		
		System.out.println("The passed object is of type"+ name);
	}

}
