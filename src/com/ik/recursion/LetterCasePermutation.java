package com.ik.recursion;

import java.util.ArrayList;

public class LetterCasePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(letter_case_permutations("a1z"));
	}

	static ArrayList<String> letter_case_permutations(String s) {
		// Write your code here.
		ArrayList<String> result = new ArrayList<String>();
		helper(s, 0, new char[s.length()], result);
		return result;
	}

	public static void helper(String input, int indx, char[] slate, ArrayList<String> result) {
		if (indx == input.length()) {
			result.add(new String(slate));
		} else {
			char ch = input.charAt(indx);
			if (Character.isLetter(ch)) {

				slate[indx] = Character.toUpperCase(ch);
				helper(input, indx + 1, slate, result);

				slate[indx] = Character.toLowerCase(ch);
				helper(input, indx + 1, slate, result);
			} else {

				slate[indx] = ch;
				helper(input, indx + 1, slate, result);
			}
		}
	}

}
