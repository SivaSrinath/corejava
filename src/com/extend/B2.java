package com.extend;

public class B2 extends A2{	
	int y=m2();	
	int m2() {
		System.out.println("B nsv");
		return 20;
	}
	{
		System.out.println("B nsB");		
	}
	B2(){
		System.out.println(" b3 constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("B main");
		
		B2 obj= new B2();
		System.out.println("\n main x:"+ obj.x);
		System.out.println("\n main y:"+ obj.y);

	}

}
