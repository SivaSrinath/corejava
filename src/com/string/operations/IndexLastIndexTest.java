package com.string.operations;

public class IndexLastIndexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "Java Programming Language";
		String s2= "sivasrinathsirisetti";
		System.out.println(s1.length());
		
		System.out.println("s2.contains(\"Program\")"+s2.contains("vas"));
		System.out.println("s2.equals(\"Program\")"+s2.equals("vas"));
		
		System.out.println(s1.indexOf('a'));
		System.out.println("s1.lastIndexOf('a')"+s1.lastIndexOf('a'));
		
		System.out.println("s1.indexOf('A')"+s1.indexOf('A'));
		System.out.println("s1.lastIndexOf('A')"+s1.lastIndexOf('A'));
		
		System.out.println("s1.indexOf('program')"+s1.indexOf("program"));
		System.out.println("s1.lastIndexOf('program')"+s1.lastIndexOf("program"));

		System.out.println("s1.indexOf('a', 5)"+s1.indexOf('a', 5));
		System.out.println("s1.lastIndexOf('a', 5)"+s1.lastIndexOf('a', 5));
		
		System.out.println("s1.indexOf('a', 24)"+s1.indexOf('a', 24));
		System.out.println("s1.lastIndexOf('a', 24)"+s1.lastIndexOf('a', 24));
		
		
	}

}
