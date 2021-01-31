package com.logical.samsung;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		
		int size = Integer.parseInt(sc.nextLine());
		
		for(int i=size; i<=size; i--) {
			for(int j=size-1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
