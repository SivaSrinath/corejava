package com.inheritance;

public class MultiInterface implements Interface1, Interface2 {

	public static void main(String[] args) {
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int sum=(int) (a+b);
		
		System.out.println(sum);
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		int area=(int) (a*b);
		
		System.out.println(area);
		
	}

	
}