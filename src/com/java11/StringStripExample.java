package com.java11;

public class StringStripExample {

	public static void main(String[] args) {
		
		String str = " JD ";
		System.out.println("Start");
		System.out.println(str.strip());
		System.out.println("End");
		
		System.out.println("Start");
		System.out.println(str.stripLeading());
		System.out.println("end");
		
		System.out.println("Start");
		System.out.println(str.stripTrailing());
		System.out.println("End");

		String str1 = "=".repeat(2);
		System.out.println(str1);
		
		
	}

}
