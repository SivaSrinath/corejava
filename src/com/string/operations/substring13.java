package com.string.operations;

public class substring13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Java Programming Language";
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 10));
		//System.out.println(s1.substring(-1, 10));
		String s2= "Java Programming Language";
		System.out.println(s2.substring(5, 12));
		
		int start = s2.indexOf("Pr");
		int end = start +7;
		System.out.println(s2.substring(start, end));
		
		
	}

}
