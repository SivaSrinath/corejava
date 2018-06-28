package com.abstraction;

public class Maruti extends Car{

	Maruti(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override 
	void steering(int direction, int angle) {
		// TODO Auto-generated method stub
		System.out.println("take a turn \t"+ direction);
		System.out.println("this is ordinary steering"+angle);
		
		
	}

	@Override
	void braking(int force) {
		// TODO Auto-generated method stub
		System.out.println("brakes applied"+ force);
		System.out.println("there are hydraulic brakes");
		
	}
	

}
