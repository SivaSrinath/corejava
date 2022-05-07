package com.java8.tutorialspoint;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = Arrays.asList("abc", "", "wxy", "");

		int count = (int) strings.stream().filter(str -> !str.isEmpty()).count();

		Optional<String> firstElement = Optional.ofNullable(strings.stream().filter(str -> str.length() > 1).findFirst().orElseThrow());
		
		System.out.println(firstElement);
		
		//Predicate<T>
		
		//Consumer<T>
		
		

	}

}
