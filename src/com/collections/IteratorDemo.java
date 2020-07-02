package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if ((i % 2) == 0) {
				System.out.println(i);
			} else {
				itr.remove();
			}
		}
		System.out.println(al);
		System.out.println(itr);

	}

}
