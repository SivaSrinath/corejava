package com.string.operations;

public class ReplaceTest22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "abc abc abc";
		System.out.println(s1);
		
		System.out.println("**********repalce**************");
		String s2= s1.replace("a", "b");
		System.out.println("s1 "+ s1);
		System.out.println("s2 "+ s2);

		System.out.println("**********replaceFirst**************");
		String s3= s1.replaceFirst("a", "b");
		System.out.println("s1 "+ s1);
		System.out.println("s3 "+ s3);
		
		System.out.println("***********replaceAll*************");
		String s4= "abc.txt";
		String s5= s4.replaceAll("\\.", "#");
		System.out.println("s5 "+ s5);
		
		System.out.println("************trim************");
		String s6= "  abc  cd ";
		System.out.println("s6 trim"+ s6.trim());
		
		String s7 = "abc$def?gh";
		String s8 = s7.replaceAll("\\$", "");
		String s9 = s7.replaceAll("\\?", "@");
		System.out.println("$ repalce :"+ s8);
		System.out.println("? repalce :"+ s9);
		
		
		
	}
}