package com.practice;

public class Practice {
	
	int x=10;
	int y=20;
	
	static {
		System.out.println("I am in static block practice class");
	}
	
	void m1() {
		System.out.println(x);
		System.out.println(y);
		
		int x=50;
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice p=new Practice();
		p.m1();
	}
}
