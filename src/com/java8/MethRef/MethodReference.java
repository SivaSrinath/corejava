package com.java8.MethRef;

import com.java8.MethRef.interf.Sayable;

public class MethodReference {
	
	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}

	public static void main(String[] args) {
		
		Sayable sayable = MethodReference::saySomething;
		
		sayable.say();
	}

}
