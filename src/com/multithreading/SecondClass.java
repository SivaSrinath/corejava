package com.multithreading;

public class SecondClass {

synchronized void secondClassMethod(FirstClass fc) {
		
		String name = Thread.currentThread().getName();
		
		System.out.println(name + "entered into sc.firstClassMethod()");
		
		try {
			
			Thread.sleep(10000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(name+ "Is trying to call sc.lastMethod");
		
		fc.lastMethod();
		
	}
	synchronized void lastMethod() {
		
		System.out.println("Inside SecondClass.lastMethod()");
	}
}
