package com.extend;

public class B11 extends A11{
	
	static int b=20;
	
	static {
		System.out.println("In SB B");
		System.out.println("a: "+a);
		System.out.println("a: "+b);
		System.out.println("b: "+getB());
	}
	static int getB() {
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" i am in main");
		System.out.println("a: "+a);
		System.out.println("b: "+ b);

	}

}
