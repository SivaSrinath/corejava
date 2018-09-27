package com.nt.arraycoac;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i = new int[5];/*
								 * System.out.println(i.length); // inserrting values i[0] = 10; i[4] = 20; //
								 * Reading values System.out.println(i[0]); System.out.println(i[1]);
								 * System.out.println(i[2]); System.out.println(i[3]); System.out.println(i[4]);
								 */

		Scanner sc = new Scanner(System.in);
		for (int l = 0; l < i.length; l++) {
			System.out.println("Enter value in:" + l + " index:");
			//i[l] = Integer.parseInt(sc.next());
			i[l]=sc.nextInt();
		}
		System.err.println("--------------------------------using for each");
		// printing data
		for (int temp : i) {
			System.out.println(temp);
		}

		System.out.println("--------------printing using for loop-------------------");
		for (int l = 0; l < i.length; l++) {
			System.out.println(i[l]);
		}
	}

}
