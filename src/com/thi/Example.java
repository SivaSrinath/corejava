package com.thi;

public class Example {
	
	int x=10;
	int y=20;
	
	void setXY() {
		x=30;
		y=40;
	}
	void printXY() {
		System.out.println(x);
		System.out.println(y);
	}
	void m1() {
		setXY();
		printXY();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example e= new Example();
		e.m1();
		System.out.println(e.x);
		

	}

}
