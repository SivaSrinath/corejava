package com.logical;

import java.util.Scanner;

public class ForLoopStringReading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size :");
		int size = Integer.parseInt(sc.nextLine());

		String st[] = new String[size];

		for (int i = 0; i < size; i++) {

			System.out.println("entering date in position :" + i);
			st[i] = sc.nextLine();
		}

		System.out.println("data in st");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + "  ");

		}
	}

}
