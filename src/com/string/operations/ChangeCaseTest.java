package com.string.operations;

public class ChangeCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aBc";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		String s2 = "_bc";
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		if(s1.equals("aBc")) {
			System.out.println("Both are equal");
		}
	}

}
