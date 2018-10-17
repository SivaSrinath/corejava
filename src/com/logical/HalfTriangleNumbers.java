package com.logical;

import java.util.Scanner;

public class HalfTriangleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int size = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}

	}

}
