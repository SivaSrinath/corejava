package com.exception.variable;

public class Case23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}
	
	static void m1() {
		int a=-20;
		try {
			a=10;
			System.out.println("In try :"+a);
		}
		catch(ArithmeticException ae) {
			a=20;
			System.out.println("In catch a:"+ a);
		}
		finally {
			
			System.out.println("In finally :"+a);
		}
		System.out.println("after try/catch/finally"+a);
	}
}