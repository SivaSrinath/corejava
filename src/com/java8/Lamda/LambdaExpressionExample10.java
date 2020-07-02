package com.java8.Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java8.Lamda.interfac.Product;

public class LambdaExpressionExample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();

		list.add(new Product(10, "Srinath", 100f));
		list.add(new Product(1, "Aditya", 100f));
		list.add(new Product(10, "Cat", 100f));

		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		
		for(Product p: list) {
			System.out.println(p.id +" "+p.name+" "+ p.price);
		}
	}

}
