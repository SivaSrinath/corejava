package com.collecions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<String, Object> sampleMap = new HashMap<>();

		sampleMap.put("rollNo", 10);
		sampleMap.put("name", "Siva");
		sampleMap.put("sal", 10000);

		System.out.println(sampleMap);

		
		for (Map.Entry<String, Object> entry : sampleMap.entrySet()) {
			System.out.print(entry.getKey() + "||");
			System.out.print(entry.getValue());

			System.out.println();

		}

		for (Object obj : sampleMap.values()) {
			System.out.println(sampleMap.get(obj));

		}
		for (String keys : sampleMap.keySet()) {
			System.out.println(sampleMap.get(keys));
		}

		Iterator<Entry<String, Object>> ite = sampleMap.entrySet().iterator();

		while (ite.hasNext()) {
			Entry<String, Object> entry = ite.next();
			System.out.print(ite.next().getKey() + "||");
			System.out.print(entry.getValue());

			System.out.println();
		}
	}

}
