package com.logical.samsung.javaprog;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		
		int num = Integer.parseInt(sc.nextLine());
		if(num % 2== 0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
	}
}
