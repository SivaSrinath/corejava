package com.java8.tutorialspoint;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Srinath");
		map.put(2, "Sahithi");
		map.put(3, "kamala");
		map.put(4, "venkateswara rao");
		
		Iterator<Entry<Integer, String>> it =map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() +"||"+entry.getValue());
		}
		
		Map<Integer, String> map2 = new HashMap<>();
		
		
	}

}
