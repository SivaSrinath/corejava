package com.logical;

import java.util.Scanner;

public class PatterenSquare {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Square Size:");
		int squareSize = Integer.parseInt(sc.nextLine());

		for (int j = 0; j < squareSize; j++) {
			for (int i = 0; i < squareSize; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
