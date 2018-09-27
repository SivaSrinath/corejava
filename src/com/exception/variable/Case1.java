package com.exception.variable;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		try {
			int b=20;
			System.out.println(a);
			System.out.println(b);
		}catch(ArithmeticException ae) {
			a=30;
		}
		System.out.println(a);

	}
	
}


