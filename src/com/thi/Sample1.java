package com.thi;

public class Sample1 {
	
	int x=10;
	int y=20;
	
	void m1()
	{
		System.out.println(x);
		System.out.println(y);
		int x=50;
		int y=60;
		System.out.println(this.x);
		System.out.println(this.y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample1 e= new Sample1();
		e.m1();
	}

}
