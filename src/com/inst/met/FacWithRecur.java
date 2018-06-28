package com.inst.met;

public class FacWithRecur {
	
	
	static long factorial(int num){
		long result;
		if(num==1) return 1;
		
		result=factorial(num-1)*num;
		System.out.println(result);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("facotorial of 5 ::");
		System.out.println(FacWithRecur.factorial(5));

	}

}
