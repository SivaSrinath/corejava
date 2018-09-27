package com.collecions;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparableTreeSet {
	public static void main(String[] args) {
		Set<Employe> data = new TreeSet<>();
		data.add(new Employe(100, "siva"));
		data.add(new Employe(1000, "siva2"));
		data.add(new Employe(500, "siva2"));
		data.add(new Employe(500, "siva2"));

		Iterator<Employe> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		 * for(Employe em:data) { System.out.println(em.getSal());
		 * System.out.println(em.getName()); }
		 */
	}
}
