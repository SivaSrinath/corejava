package com.logical.samsung;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("enter size");

		//String size = sc.nextLine();

		char size = 'E';

		for(char i='A'; i<size; i++) {
			for(char j='A'; j<size; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
