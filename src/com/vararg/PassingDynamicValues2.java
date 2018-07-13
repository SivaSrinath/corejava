package com.vararg;

import java.util.Scanner;

public class PassingDynamicValues2 {
	
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
		
		System.out.println("how many number of values do you want to give..");
		
		int noOfValues= sc.nextInt();
		
		int[] inputValues = new int[noOfValues];
		
		for(int i=0; i<noOfValues; i++) {
			System.out.println("Enter Num"+(i+1)+":");
			inputValues[i]= sc.nextInt();			
		}
		add(inputValues);

	}

}
