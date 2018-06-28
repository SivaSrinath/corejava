package com.inheritance;

public class Square extends Shape{

	Square(double l) {
		super(l);
		// TODO Auto-generated constructor stub
	}
	
	void area(){
		System.out.println("area of square is"+(l*l));
	}

}
