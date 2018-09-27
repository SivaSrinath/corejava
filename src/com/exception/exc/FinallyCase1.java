package com.exception.exc;

public class FinallyCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}
	
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
			return 30;
		}
	}

}
