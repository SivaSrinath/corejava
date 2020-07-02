package com.supe;

public class Sample extends Example{

	
	Sample(){
		System.out.println("I am in sample constructor");
	}
	
	Sample(int a){
		super(10);
		System.out.println("Sample--int param");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s= new Sample();
		
		Sample s1= new Sample(10);
	}

}
