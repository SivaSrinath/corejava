package com.java8.tutorialspoint;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> isEven = i -> i%2 == 0;
		
		Predicate<Integer> isOdd = isEven.negate();
		
		// using not
		Predicate.not(isOdd); // it gives the even numbers
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> evenNumbers = list.stream()
										.filter(isEven)
										.collect(Collectors.toList());
		
		List<Integer> oddNumbers = list.stream().filter(isOdd).collect(Collectors.toList());
		
		System.out.println(evenNumbers + " "+ oddNumbers);
		
		list.stream().map(num -> num*3).forEach(System.out::println);
		
		

	}

}
