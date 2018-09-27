package com.collecions;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack<String> linkedList = new Stack<>();
		
		linkedList.push("d1");
		linkedList.add("d2");
		linkedList.add("d3");
		
		System.out.println(linkedList.peek());
		System.out.println(linkedList.pop());
		
		
		System.out.println("Final Data:"+linkedList);

	}
}
