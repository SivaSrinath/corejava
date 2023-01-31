package com.logical;

import java.util.Scanner;

public class PalindormeChek {

	public static void main(String[] args) {
		
		String original, reverse = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to check palindrome or not");
		
		original = sc.nextLine();
		
		int length = original.length();
		System.out.println("length of a string is "+ length);
		
		for(int i= length-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}

		if(original.equals(reverse)) {
			System.out.println("Entered string is palindrome");
		}else
			System.out.println("Entered string is no palindrome");
		
	}

}
