package com.exception.exc;

public class FinallyCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println();
	}
	//supressing exception without using catch block
	static  void m1() {
		try {
			System.out.println("In try");
			System.out.println(10/0);
			//return 10/0;
		}
		catch(NullPointerException e) {
			System.out.println("In catch");
			//return 20;
		}
		finally {
			System.out.println("In finally");
			int a[]= new int[-5];
			//return ;
		}
		
	}
}