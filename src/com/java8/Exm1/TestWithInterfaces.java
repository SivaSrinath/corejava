package com.java8.Exm1;

public class TestWithInterfaces {

	
	interface FuncInterf1{
		int operation(int a, int b);
	}
	
	interface FuncInter2{
		void sayMessage(String st);
	}
	
	private int operate(int a, int b, FuncInterf1 obj) {
		return obj.operation(a,b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestWithInterfaces twi = new TestWithInterfaces();
		FuncInterf1 add = (int x, int y) -> x+y;
		
		System.out.println("Addition is:"+ twi.operate(5,6, add));

	}

}
