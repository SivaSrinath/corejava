package com.exception.exc;

public class FinallyWithBreak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1(5));
	}
	
	static int m1(int a) {
		while(a == 5) {
			try {
				return 10;
			}
			finally {
				break;
			}
		}
		return 20;
	}

}
