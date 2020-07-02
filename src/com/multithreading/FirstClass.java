package com.multithreading;

public class FirstClass {
	
	synchronized void firstClassMethod(SecondClass sc) {
		
		String name = Thread.currentThread().getName();
		
		System.out.println(name + "entered into fc.firstClassMethod()");
		
		try {
			
			Thread.sleep(10000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(name+ "Is trying to call sc.lastMethod");
		
		sc.lastMethod();
		
	}
	synchronized void lastMethod() {
		
		System.out.println("Inside FirstClass.lastMethod()");
	}

}
