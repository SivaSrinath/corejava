package com.java8.MethRef;

import com.java8.MethRef.interf.Sayable;

public class InstanceMethodReference {

	public void saySomething() {
		System.out.println("This is not a static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceMethodReference MethodReference = new InstanceMethodReference();
		
		//referring non static method using reference 
		Sayable sayable = MethodReference::saySomething;
		
		sayable.say();
		
		// Refering Non static method using anonymous object
		
		Sayable sayable1 = new InstanceMethodReference()::saySomething;
		
		sayable1.say();	

	}
}
