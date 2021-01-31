package com.exception.exc;

public class FinallyCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}
	
	@SuppressWarnings("finally")
	static int m1() {
		try {
			System.out.println("In try");
			return 10/0;
		}
		catch(NullPointerException e) {
			System.out.println("In catch");
			return 20;
		}
		finally {
			System.out.println("In finally");
			if(true) {
				return 30;
			}
		}
		//System.out.println("after try/catch/finally");
	}

}
