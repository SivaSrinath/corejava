package com.logical.samsung.javaprog;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int fact=1;
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<num; i++) {
			fact=fact*i;
		}
		System.out.println("factorial value is :"+fact);
	}

}
