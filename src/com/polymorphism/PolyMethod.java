package com.polymorphism;

public class PolyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Poly p=new Poly();
		p.sum(10,20);
		
		p.sum(10, 0.05);
		
		Poly1 p1=new Poly1();
		p1.sum(10, 35);
		p1.m1();
		
		Poly p2 = new Poly1();
		
		p2.sum(10, 10f);
		//p2.m2();
	}
}
