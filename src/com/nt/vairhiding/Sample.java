package com.nt.vairhiding;

public class Sample extends Example {
	
	static int x=30;
	int y=40;
	
	void m2() {
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		System.out.println("x:" + super.x);
		System.out.println("y:" + super.y);
	}	
	void m3() {
		
		int x=50;
		int y=40;
		System.out.println("local x:" + x);
		System.out.println("local y:" + y);
		
		System.out.println("subclass x:" + this.x);
		System.out.println("subclass y:" + this.y);
		
		System.out.println("super class x:" + super.x);
		System.out.println("super class y:" + super.y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		
		s.m2();
		s.m3();
	}
}