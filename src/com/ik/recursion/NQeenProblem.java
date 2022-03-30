package com.ik.recursion;

import java.util.ArrayList;

public class NQeenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(find_all_arrangements(4));

	}
	

    static ArrayList<ArrayList<String>> find_all_arrangements(Integer n) {
        ArrayList<ArrayList<String>>  result = new ArrayList<>();

		// moving pointer row by row and placing queen on a column in which 
		// there is no conflict with other queens
		// each queen will have 'n' choices to make
		// Time: O(n^n)
		// Space: O(N)
		helper(n, 0, new int[n], result);
		return result;
	}

	static void helper(int n, int i, int[] board, ArrayList<ArrayList<String>>  result) {

		// base case, successfully placed the queens
		if (i == n) {
			result.add(createBoard(board));
			return;
		}

		// recursive case
		for (int j = 0; j < n; j++) {
			// prune case
			if (!hasConflict(board, i, j)) {
				board[i] = j;
				helper(n, i + 1, board, result);
			}
		}
	}

	/**
	 * 
	 * @param board
	 * @param row
	 * @param col
	 * @return
	 */
	static boolean hasConflict(int[] board, int row, int col) {

		// conflict for all previous queens
		for (int r = 0; r < row; ++r) {
			// since rows are different there will not be any row conflict
			// no need to check
			// check column conflict
			if (col == board[r]) {
				return true;
			}

			// diagonal conflict
			int colDiff = Math.abs(col - board[r]);
			int rowDiff = Math.abs(r - row);
			if (colDiff == rowDiff) {
				return true;
			}
		}
		return false;
	}

	static ArrayList<String> createBoard(int[] board) {
		ArrayList<String> result = new ArrayList<>();
		for(int r = 0; r < board.length ; r++) {
			StringBuilder builder = new StringBuilder();
			for(int c = 0; c < board.length; c++) {
				builder.append("-");
			}
			builder.setCharAt(board[r], 'q');
			result.add(builder.toString());
		}
		return result;
	}


}
