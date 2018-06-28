package com.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("balakrishna");
		l.add("srinath");
		l.add("rishi");
		l.add("ashish");
		l.add("chiru");
		System.out.println(l);
		
		ListIterator itr=l.listIterator();
		while(itr.hasNext()){
			String s=(String) itr.next();
			if(s.equals("rishi")){
				itr.add("sahithi");
			}
			//System.out.println(itr);
			
		}
		System.out.println(l);
		System.out.println(itr);
	}


}


