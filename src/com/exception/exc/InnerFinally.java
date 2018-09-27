package com.exception.exc;

public class InnerFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
	}
	static int m1() {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
				System.out.println(10/0);
			}catch(NullPointerException nfe) {
				System.out.println("In inner catch");
			}
			finally {
				System.out.println("In inner finally");
				return 20;
			}
		}catch(ArithmeticException nfe2) {
			System.out.println("In outer catch");
		}finally {
			System.out.println("In outer finally");
		}
		System.out.println("After outer try/catch/finally");
		return 30;
		
		
		
	}
}
