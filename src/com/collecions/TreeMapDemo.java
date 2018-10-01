package com.collecions;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

		Map<String,Integer> data=new TreeMap<>();
		
		data.put("c", 1);
		data.put("b", 2);
		data.put("a", 3);
		data.put("d", 1);
		
		Iterator<Entry<String, Integer>>  it = data.entrySet().iterator();
		while(it.hasNext()) {
			
			Entry<String, Integer> entry= it.next();
			System.out.println(entry.getKey()+ "||"+ entry.getValue());
			System.out.println();
			
		}
		
	}
}
