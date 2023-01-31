package com.logical;

import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, i, sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum from :");
		
		//takes integer as input
		i = sc.nextInt();
		System.out.println("Sum up to :");
		
		//takes an integer as an input
		num = sc.nextInt();
		while(i<=num) {
			sum = sum+i;
			i++;
		}
		
		System.out.println("Sum of natural numbers is "+ sum);
		
	}

}
