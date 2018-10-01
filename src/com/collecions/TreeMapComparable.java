package com.collecions;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapComparable {
	public static void main(String[] args) {

		Map<Employe,Integer> data=new TreeMap<>();

		data.put(new Employe(10,"Srinu"), 100);
		data.put(new Employe(200,"hari"), 200);
		data.put(new Employe(30,"srinath"), 300);
		
		System.out.println(data.get(new Employe(10,"Srinu")));
		
		Iterator<Entry<Employe, Integer>>  it = data.entrySet().iterator();
		while(it.hasNext()) {
			
			Entry<Employe, Integer> entry= it.next();
			System.out.println(entry.getKey()+ "||"+ entry.getValue());
			System.out.println();
		}
		
	}
}
