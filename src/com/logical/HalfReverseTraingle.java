package com.logical;

import java.util.Scanner;

public class HalfReverseTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<size; i++) {
			for(int j=size-1; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		test();

	}
	
	public static void test() {
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<size; i++) {
			for(int j= 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
