package com.interview;

public class FindMissingNumber {

//	Calculate the sum of the first N natural numbers as sumtotal= N*(N+1)/2.
//			Traverse the array from start to end.
//			Find the sum of all the array elements.
//			Print the missing number as SumTotal – sum of array
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6};
		
		int N = arr.length;
		System.out.println(getMissingNo(arr, N));

	}
	
	public static int getMissingNo(int[] nums, int n) {
		
		int sum = (n*(n+1))/2;
		for(int i=0; i<n; i++) {
			sum -= nums[i];
		}
		return sum;
		
	}

}
