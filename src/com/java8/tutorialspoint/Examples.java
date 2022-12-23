package com.java8.tutorialspoint;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List<String> strings = Arrays.asList("abc", "", "wxy", "");
		 * 
		 * int con = (int) strings.stream().filter(string -> !string.isEmpty()).count();
		 * System.out.println("count is " + con);
		 * 
		 * List<String> filtered = strings.stream().filter(string ->
		 * !string.isEmpty()).collect(Collectors.toList());
		 * System.out.println("Strings :" + filtered);
		 * 
		 * List<Integer> num = Arrays.asList(3, 4, 6, 9, 10);
		 * 
		 * List<Integer> square = num.stream().map(i->
		 * i*i).distinct().collect(Collectors.toList());
		 * 
		 * System.out.println("i*i :"+ square);
		 */
		Random r = new Random();
		
		r.ints().limit(10).forEach(System.out::println);
		
		List<String> strings = Arrays.asList("abc", "", "wxy", "");
		
		int count = (int) strings.stream().filter(str -> !str.isEmpty()).count();
		
		Optional<String> firstElement = strings.stream()
										.filter(str -> str.length()>1)
										.findFirst();
		if(firstElement.isPresent()) {
			System.out.println(firstElement.get());
		}
		
		List<String> strList1 = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
		
		strList1.forEach(str -> System.out.println(str));
		
		System.out.println(count);
		
		List<String> strList = strings.stream()
				.filter(str -> !str.isEmpty())
				.collect(Collectors.toList());
		
		List<Integer> num = Arrays.asList(3,4,5,6);
		
		List<Integer> numSquareList = num.stream().map(i -> i*i).collect(Collectors.toList());
		
		
		num.stream().map(i -> i*2).collect(Collectors.toList());
		
		List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
		List<Integer> evenNumbers = ages.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		
		evenNumbers.forEach(e -> System.out.println(e));
		
		int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b);
		
		System.out.println("Computed ages :"+ computedAges);
		
		
	}
}