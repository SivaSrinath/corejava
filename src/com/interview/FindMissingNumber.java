package com.interview;

import java.util.Arrays;

public class FindMissingNumber {

//	Calculate the sum of the first N natural numbers as sumtotal= N*(N+1)/2.
//			Traverse the array from start to end.
//			Find the sum of all the array elements.
//			Print the missing number as SumTotal – sum of array
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9, 11,12};
		
		int n = arr.length+1;
		System.out.println("Length is "+ n);
		int idealSum = (n*(n+1))/2;
		
		System.out.println("Ideal sum is "+ idealSum);
		
		//int sum = calculateSum(arr);
		
		int sum = Arrays.stream(arr).sum();
		
		System.out.println("Sum is "+ sum);
		
		int missingNumber = idealSum - sum;
		
		System.out.println("Missing number is "+ missingNumber);

	}
	
	public static int calculateSum(int[] nums) {
		
		int sum = 0;
		for(int n: nums) {
			sum += n;
		}
		return sum;
		
	}

}
