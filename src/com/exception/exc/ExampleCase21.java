package com.exception.exc;

public class ExampleCase21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}

	static int m1() {
		try {
			System.out.println("In try");
			return 10;
		} catch (ArithmeticException ae) {
			System.out.println("In catch");
		} finally {
			System.out.println("In finally");
			if (true) {
				return 30;
			}
		}
		System.out.println("after try/catch/finally");
		return 0;
	}
}
