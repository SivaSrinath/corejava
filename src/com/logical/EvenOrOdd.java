package com.logical;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number :");
		int number= Integer.parseInt(sc.nextLine());


		if(number%2 == 0) 
			System.out.println("number "+number+" is  even");
		else
			System.out.println("number "+number+" is  odd");
		
	}

}
