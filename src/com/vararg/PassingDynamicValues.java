package com.vararg;

import java.util.Scanner;

public class PassingDynamicValues {
	
	static void add(int... a) {
		if(a.length==0) {
			System.out.println("values are not passed");
		}else {
			int sum=0;
			for(int i=0; i<a.length;i++) {
				sum= sum+a[i];
			}
			System.out.println("result :"+ sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number 1");
		
		int n1= sc.nextInt();
		
		System.out.println("enter number 2");
		
		int n2= sc.nextInt();
		add(n1,n2);
		
	}

}
