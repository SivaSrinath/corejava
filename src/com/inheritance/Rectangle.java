package com.inheritance;

public class Rectangle extends Square{

	private double b;
	Rectangle(double x, double y) {
		super(x);
		b=y;
		// TODO Auto-generated constructor stub
	}
	void area(){
		System.out.println("area of rectangle is ::"+(b*l));
	}

}
