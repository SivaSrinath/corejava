package com.inst.met;

public class FactWitoutRecur {
	
	
	static long factorial(int num){
		long fact=1;
		
		while(num>0){   
			fact=fact*num;
			num--;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("factorial of 5 ::");
		System.out.println(FactWitoutRecur.factorial(5));

	}

}
