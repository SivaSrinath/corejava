package com.exception.exc;

public class TryWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("In try");
			System.exit(0);
			//return ;
		}
		finally {
			System.out.println("In finally");
		}
		//System.out.println("after try/finally");

	}

}
