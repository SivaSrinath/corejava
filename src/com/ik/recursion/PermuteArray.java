package com.ik.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermuteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		
		System.out.println("Possible permutations are :"+ get_permutations(arr));

	}

	static ArrayList<ArrayList<Integer>> get_permutations(ArrayList<Integer> arr) {
		// Write your code here.
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		helper(arr, 0, result);

		return result;
	}

	static void helper(List<Integer> input, int ind, ArrayList<ArrayList<Integer>> result) {

		// base case
		if (ind >= input.size()) {
			result.add(new ArrayList(input));
			return;
		}

		// recursion
		for (int i = ind; i < input.size(); i++) {
			Collections.swap(input, ind, i); // swap
			helper(input, ind + 1, result);
			Collections.swap(input, ind, i); // restore state
		}
	}

}
