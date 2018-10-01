package com.collecions;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparatorTreeMap {
	//ComparatorDemo
	public static void main(String[] args) {
		Map<Employe,Integer> data = new TreeMap<>(new ComparatorDemo());
		
		data.put(new Employe(100, "siva"), 200);
		data.put(new Employe(1000, "siva2"), 400);
		data.put(new Employe(500, "siva2"), 600);

		Iterator<Entry<Employe, Integer>> it = data.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Employe, Integer> entry= it.next();
			System.out.println(entry.getKey()+ "||"+ entry.getValue());
			System.out.println();
		}
		/*
		 * for(Employe em:data) { System.out.println(em.getSal());
		 * System.out.println(em.getName()); }
		 */
	}
}