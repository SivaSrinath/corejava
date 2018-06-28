package com.inheritance;

public class Three {
	
	static{
		System.out.println("I am a static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("starting of main method");
		
		Two t=new Two();
		
		t.show();
		
		System.out.println("ending of main method");
		 
		

	}

}
