package com.constr.meth;

public class Sample {
	//instance variable
	
	private double num1=10, num2=20;
	Sample(){
		System.out.println("hi I am a constructor");
	}
	Sample(double x, double y){
		num1=x;
		num2=y;
		System.out.println("I am a second constructor");
	}
	
	// method to calculate sum of num1 num2
	//this method does not accept any values and does not return any value
	
		public double sum() {
		// TODO Auto-generated method stub
		double res= num1+num2;
		System.out.println("sum is without parameter in method ::  "+res);
		return res;
	
	}
		
	public	double sum(int x, int y){
		double res1=x+y;
		System.out.println("The result is with parameters in method :: "+res1);
			return res1;
		}

}
