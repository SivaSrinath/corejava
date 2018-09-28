package com.collecions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HasSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		
//		Set<Integer> hashSet = new LinkedHashSet<>();

		for (int i = 0; i < 20; i++) {
			System.out.println(hashSet.add(i));
		}
		// System.out.println(hashSet.add(10));
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add(100);
		

		Iterator<Integer> it = hashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
