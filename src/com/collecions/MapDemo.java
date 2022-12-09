package com.collecions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Object> sampleMap = new HashMap();

		//Map<String, Object> sampleMap = new Hashtable();
		
		sampleMap.put("rollNo", 10);
		sampleMap.put("name", "Siva");
		sampleMap.put("sal", 10000);
		
		for(Object obj:  sampleMap.values()) {
			System.out.println(obj);
		}
		
		for(String st:  sampleMap.keySet()) {
			System.out.println(st);
		}
		System.out.println("******for each********");
		for(Map.Entry<String, Object> st: sampleMap.entrySet()) {
			System.out.println(st.getKey()+ "||"+ st.getValue());
			System.out.println();
		}
		System.out.println("*********iterator********");
		Iterator<Entry<String, Object>>  ite=sampleMap.entrySet().iterator();
		while(ite.hasNext()) {
			Entry<String, Object> entry = ite.next();
			System.out.println(entry.getKey() + "||"+ entry.getValue());
			System.out.println();
		}
		
	}
}
