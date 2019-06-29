package com.java8.tutorialspoint;

public class JavaTester8 {

	public static void main(String[] args) {
		
		JavaTester8 test = new JavaTester8();
		
		MathOperation addition = (int a, int b) ->a+b;
		
		MathOperation substraction = (a, b) -> a-b;
		
		MathOperation multi = (a, b) -> a*b;
		
		System.out.println("addition is "+ test.operate(5,10, addition));
		
		Greeting gre1 = message -> System.out.println("Hello :"+ message);
		
		Greeting gre2 = (message) -> System.out.println("Hello :"+ message);
		
		gre1.sayMessage("srinath");
		gre2.sayMessage("sahithi");
	}
	
	interface MathOperation {
		int operation(int a, int b);
	}
	
	interface Greeting{
		void sayMessage(String message);
	}
	
	private int operate(int a, int b, MathOperation mathOper) {
		return mathOper.operation(a,b);
	}
}