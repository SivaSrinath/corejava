package com.exception.exc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			System.out.println("getMessage() method output");
			System.out.println(ae.getMessage());
			System.out.println("=========================\n");
			
			System.out.println("toString() method output");
			System.out.println(ae.toString());
			System.out.println("=========================\n");
			
			System.out.println("printStackTrace() method output");
			ae.printStackTrace();
			System.out.println("=========================\n");
			
			System.out.println("jvm default output");
			throw ae;
			
		}

	}

}
