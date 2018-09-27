package com.overri;

public class A18 {
	static int a=10;
	int x=20;
	
	static void m1() {
		System.out.println("A m1");
	}
	void m2() {
		System.out.println("A m2");
	}
	void m3() {
		System.out.println(" A m3");
		System.out.println(" A m3 a: "+ a);
		System.out.println(" A m3 x:"+ x);
		m1();
		m2();
	}

}
