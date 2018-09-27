package com.overri;

public class B18 extends A18{
	
	static int a=50;
	int x=60;
	
	static void m1() {
		System.out.println("B m1");
	}
	void m2() {
		System.out.println("B m2");
		System.out.println("B m1 a:"+a);
		System.out.println("B m1 x:"+ x);
	}
	void m4() {
		System.out.println("I am in B18 m4");
		super.a=a-10;
		super.x= x-10;
	}

}
