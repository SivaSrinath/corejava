package com.string.operations;

public class InternTest25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Hari";
		String s2= s1.intern();
		System.out.println(s1.intern());
		System.out.println(s1==s2);
		
		String s3= new String("NIT");
		String s4= s3.intern();
		String s5= "NIT";
		System.out.println(s3==s5);
		System.out.println(s4==s5);
	}
}