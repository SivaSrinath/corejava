package com.exception.exc;

public class FinallyWithBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++) {
			System.out.println("\n In loop :"+i);
			try {
				System.out.println("I am in try");
				if(i == 5) {
					//break;
					continue;
					//return;
				}
			}
			finally {
				System.out.println("In finally");
			}
			System.out.println("after try/finnlly");
		}
		System.out.println("\n after loop");

	}

}
