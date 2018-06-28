package com.nt.construc;

public class Sample extends Example{

	/*Sample(){
		System.out.println("Sample zero parameter");
	}*/
	
	Sample(int a){
		super(50);
		System.out.println("Sinmple int parameter");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sample s1=new Sample();
		
		Sample s2=new Sample(10);

	}
}