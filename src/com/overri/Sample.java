package com.overri;

public class Sample extends Example {
	
	static void m1() {
		System.out.println("sample static m1");
	}
	void m2() {
		//super.m2();
		System.out.println("sample m2");
		super.m2();
	} 
	void m3() {
		System.out.println("sample m3");
	}
	void m4(String s) {
		System.out.println("sample m3(int-param)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s= new Sample();
		//m1();
		s.m2();
		//s.m3();
//		s.m4();
//		s.m4("srinath");
//
//		Example e= new Example();
//		e.m1();
//		e.m2();
//		e.m3();
//		e.m4();
//		//e.m4("Srinath");
	}

}
