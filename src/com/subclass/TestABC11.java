package com.subclass;

public class TestABC11 {
	
	static {
		System.out.println("testabc11 is loaded");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B11 b1 = new B11();
		C11 c1= new C11();
		
		b1.a= 15;
		b1.x= 16;
		
		System.out.println("b1.a: "+ b1.a);
		System.out.println("c1.a:" + c1.a);
		
		System.out.println("b1.x:" + b1.x);
		System.out.println("c1.x:" + c1.x);
		

	}

}
