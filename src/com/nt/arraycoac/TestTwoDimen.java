package com.nt.arraycoac;

import java.util.Scanner;

public class TestTwoDimen {

	public static void main(String[] args) {

		int[][] a = new int[2][3];
		// setting values
		a[0][0] = 1;
		System.out.println(a[0][0]);
		System.out.println(a.length); // represents rows
		System.out.println(a[1].length);// represents columns
		Scanner sc = new Scanner(System.in);
		// reading data into array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("Enter Value in " + i + " and " + j + " Position:");
				a[i][j] = Integer.parseInt(sc.next());
				System.out.println();
			}

		}
		Object obj = new Object();
		
		// printing values of array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");

			}
			System.out.println();
		}

	}

}
