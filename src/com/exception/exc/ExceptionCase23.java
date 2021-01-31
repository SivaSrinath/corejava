package com.exception.exc;

public class ExceptionCase23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		try {
			a = 20;
			System.out.println(a);
		}catch(ArithmeticException ae) {
			a=30;
			System.out.println(a);
		}
		System.out.println(a);
	}
	
	

}
