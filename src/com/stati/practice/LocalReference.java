package com.stati.practice;

public class LocalReference {
	
	int x =10;
	int y=20;
	void setXY(int x) {
		//x =50;
		this.x = x;
		y=60;
	}
	void printXY() {
		System.out.println("x" +x);
	}
	void m1() {
		setXY(50);
		printXY();
	}
	public static void main(String args[]) {
		LocalReference l2= new LocalReference();
		l2.m1();
	}
}
