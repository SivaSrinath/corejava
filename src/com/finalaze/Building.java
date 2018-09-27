package com.finalaze;

public class Building {
	
	Furniture f;
	Building(Furniture f){
		this.f= f;
	}
	
	@Override
	public void finalize() {
		System.out.println("in finalize method");
		f=null;
	}

}
