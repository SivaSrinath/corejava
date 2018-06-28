package com.extend;

public class B1 extends A1{
	
	static int b=m2();
	static int m2() {
		System.out.println("b sv");
		return 20;
	}
	static {
		System.out.println("B SB");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			System.out.println("B main");
			System.out.println("\nB main a:"+ a);
			System.out.println("B main b:"+ b);
	}

}