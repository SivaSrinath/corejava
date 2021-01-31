package com.exception.exc;

public class ExampleCase21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}

	//@SuppressWarnings("finally")
	static int m1() {
		try {
			System.out.println("In try");
			return 10;
		} catch (ArithmeticException ae) {
			System.out.println("In catch");
			//return 20;
		} finally {
			System.out.println("In finally");
			//int[] i = new int[-5];
			//return 30;
			
			  if (false) { return 30; }
			 
		}
		System.out.println("after try/catch");
		return 50;
	}
}
