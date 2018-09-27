package com.exception.exc;

public class ExceptionCasess {

	public static void main(String[] args) {

		System.out.println(exceptionMethod());

	}

	public static int exceptionMethod() {

		try {
			System.out.println("I am in try block");
			System.out.println(10/0);
		} /*catch (NullPointerException e) {
			System.out.println(e.getMessage());
			return 20;
		}*/ finally {
			return 30;
		}
	}
}
