package com.upcasting;

public class Test {

	
	float f1=10;
	long l = 20;
	float f2= l;
	//long l2= (float)f1;
	
	public static void main(String args[]) {
		
		Example1 e = new Sample();
		
		
		e.m1();
		Sample s= (Sample)e;
		s.m2();
	}
}
