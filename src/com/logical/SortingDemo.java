package com.logical;

import java.util.Scanner;

public class SortingDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size :");
		int size = Integer.parseInt(sc.nextLine());

		int a[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter value position :" + i);
			a[i] = Integer.parseInt(sc.nextLine());
		}

		// 4 2 8 4 2 7 8 4
		//temp 4
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("sorting order is :");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}
}
