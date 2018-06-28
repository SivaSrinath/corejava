package com.extend;

public class A1 {
	
	static int a=m1();
	
	static int m1() {
		System.out.println("a static variable");
		return 10;
	}
	
	static {
		System.out.println("a static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			System.out.println("a main");		
	}

}