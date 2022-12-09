package com.java8.tutorialspoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OptionalExample {

	public static void main(String[] args) throws IOException {
		

		List<String> strings = Arrays.asList("abc", "", "wxy", "");

		int count = (int) strings.stream().filter(str -> !str.isEmpty()).count();
		
		String mergedString = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(","));
		
		System.out.println("Merged String is "+ mergedString);
		
		List<String> stringsList= strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
		
		stringsList.stream().forEach(e -> System.out.println("Each stringList "+e));

		System.out.println("Count is " + count);
		
		long countLong = strings.stream().filter(str -> str.length()>1).count();
		System.out.println("count using long "+ countLong);

		Optional<String> firstElement = Optional
				.ofNullable(strings.stream().filter(str -> str.length() > 1).findFirst().orElseThrow());
		
		
		if(firstElement.isPresent()) {
			System.out.println(firstElement.get());
		}
		

		 //Predicate<T>

		 //Consumer<T>]

		BufferedReader br = new BufferedReader(null);

		try (br) {
			System.out.println(br.readLine());
		}

	}

}
