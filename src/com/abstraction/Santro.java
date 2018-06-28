package com.abstraction;

public class Santro extends Car{

	Santro(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	void steering(int direction, int angle) {
		// TODO Auto-generated method stub
		
		System.out.println("take a turn");
		System.out.println("this is ordinary steering");
		
		
	}

	@Override
	void braking(int force) {
		// TODO Auto-generated method stub
		System.out.println("brakes applied");
		System.out.println("there are hydraulic brakes");
		
	}
	
	

}
