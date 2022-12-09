package com.logical;

import java.util.Scanner;

public class ForLoopStringReading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size :");
		int size = Integer.parseInt(sc.nextLine());

		String st[] = new String[size];

		for (int i = 0; i < size; i++) {

			System.out.println("entering data in position :" + i);
			st[i] = sc.nextLine();
		}

		System.out.println("data in st");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + "  ");

		}
		matrix();
	}
	
	public static void matrix() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row matrix :");
		
		int row = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter size of column matrix :");
		
		int col = Integer.parseInt(sc.nextLine());
		
		int[][] mat = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println("enter position "+ i + j);
				mat[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.println(mat[i][j]);
			}
		}
		
		
		
	}

}
