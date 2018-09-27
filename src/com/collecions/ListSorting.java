package com.collecions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employe> data= new ArrayList<>();
		
		data.add(new Employe(100, "siva"));
		data.add(new Employe(1000, "siva2"));
		data.add(new Employe(500, "siva2"));

		System.out.println(data);
		Collections.sort(data);
		Collections.sort(data,new ComparatorDemo());
		System.out.println(data);
	}

}
