package com.abstraction;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti m=new Maruti(10001);
		Santro s=new Santro(5005);
		// create reference to super class car
		Car  ref;
		ref=m;
		
		ref.opentank();
		ref.steering(1,90);
		ref.braking(500);
  
		Car refs;
		refs=s;
		
		refs.opentank();
		refs.steering(2, 30);
		refs.braking(200);
		
		
		

	}

}
