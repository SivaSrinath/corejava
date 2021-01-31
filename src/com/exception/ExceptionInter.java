package com.exception;

import java.io.IOException;

public class ExceptionInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(testMethod());
		System.out.println("done the process");
	}
	
	
	private static void someHow() throws Exception {
		throw new Exception();
		
	}
	
	private static int testMethod() {
		try {
			someHow();
			return 1;
		}catch(IOException io) {
			System.out.println("I am in IOException ");
			return 2;
		}catch(Exception e) {
			System.out.println("I am in Exception ");
			return 3;
		}finally {
			System.out.println("I am in finally block ");
			if(true)
				return 4;
		}
		//System.out.println("after try catch block");
	}

}
