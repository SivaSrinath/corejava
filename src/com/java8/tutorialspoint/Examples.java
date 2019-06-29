package com.java8.tutorialspoint;

import java.util.Arrays;
import java.util.List;
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
		
		
	}
}