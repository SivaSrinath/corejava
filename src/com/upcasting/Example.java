package com.upcasting;

public class Example {
	
	final int T1=10;
	float f1=10f;
	
	//int i2= (int) (i1+f1);
	
	void m1() {
		System.out.println("I am in example class");
	};
	public static void main(String args[]) {
		String s1="Srinath";
		String s2=s1.intern();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
	

}
