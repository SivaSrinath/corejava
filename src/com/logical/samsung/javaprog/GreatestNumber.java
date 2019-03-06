package com.logical.samsung.javaprog;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		int a[];
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = Integer.parseInt(sc.nextLine());
		
		a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the numbers");
			a[i] = Integer.parseInt(sc.nextLine());
		}
		int ma = max(a,n);
		System.out.println("largest number is "+ma);
	}
	static int max(int[] a,int n) {
		int m=0;
		for(int i=0; i<n; i++) {
			if(a[i]>m) {
				m=a[i];
			}
		}
		return m;
	}
}