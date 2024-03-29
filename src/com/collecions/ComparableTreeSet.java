package com.collecions;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparableTreeSet {
	public static void main(String[] args) {
		Set<Employe> data = new TreeSet<>();
		
		data.add(new Employe(100, "siva"));
		data.add(new Employe(1000, "s"));
		data.add(new Employe(5000, "s1"));
		data.add(new Employe(10000, "s2"));

		
		Iterator<Employe> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Using streams");
		
		data.stream().forEach(c -> System.out.println(c));
		/*
		 * for(Employe em:data) { System.out.println(em.getSal());
		 * System.out.println(em.getName()); }
		 */
	}
}
