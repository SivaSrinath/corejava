package com.collecions;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Employe> {

	@Override
	public int compare(Employe emp1, Employe emp2) {
		System.out.println("I am in Comaparator method");
		if (emp1.getSal() == emp2.getSal())
			return 0;
		if (emp1.getSal() > emp2.getSal())
			return -1;

		if (emp1.getSal() < emp2.getSal())
			return 1;

		return 0;
	}

	//Comparable<T>
}
