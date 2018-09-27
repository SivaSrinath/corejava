package com.exception.exc;

import java.io.IOException;

public class FinallyWhileBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(m1(5));

	}
	static int m1(int a) {
		while(a == 5) {
			try {
				System.out.println("I am in try");
				return 1000000000;
			}
			catch(ArithmeticException io) {
				
				System.out.println("I am in finally");
				break;
				//continue;
			}
		}
		return 20;
	}

}
