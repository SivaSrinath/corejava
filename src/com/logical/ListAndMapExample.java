package com.logical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListAndMapExample {
	public static void main(String[] args) {

		List<Map<String, String>> listMap = new ArrayList<>();
        
		Map<String,String> map=new LinkedHashMap<>();
		map.put("one","hi");
		map.put("one1","hi");
		map.put("one2","hi");
		map.put("one3","hi");
		
		listMap.add(map);
		listMap.add(map);
		listMap.add(map);
		
		/*for(int i=0; i<listMap.size(); i++) {
			Map<String, String> mapEntry= listMap.get(i);
			Iterator<Entry<String, String>> entry=mapEntry.entrySet().iterator();
			while(entry.hasNext()) {
				Entry<String, String> kv=entry.next();
				
				System.out.println(kv.getKey()+"||"+ kv.getValue());
			}
			System.out.println("--------------");
		}*/
		
		for(Map<String, String> mapEntry:listMap) {
			for(Map.Entry<String, String> kv: mapEntry.entrySet()) {
				System.out.println(kv.getKey()+"||"+ kv.getValue());
			}
			System.out.println("****************");
			
		}
	}
}