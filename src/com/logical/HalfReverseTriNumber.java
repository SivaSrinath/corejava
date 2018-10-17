package com.logical;

import java.util.Scanner;

public class HalfReverseTriNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size :");
		
		int size =  Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<size; i++) {
			for( int j=size-1; j>=i; j--) {
				System.out.print(size-i);
			}
			System.out.println();
		}

	}

}
