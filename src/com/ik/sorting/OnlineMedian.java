package com.ik.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class OnlineMedian {

	public static void main(String[] args) {
		ArrayList<Integer> streams = new ArrayList<Integer>();
		
		streams.add(3);
		streams.add(8);
		streams.add(5);
		streams.add(2);
		
		System.out.println(onlineMedian(streams));

	}
	
	public static ArrayList<Integer> onlineMedian(ArrayList<Integer> streams){
		
		ArrayList<Integer> median = new ArrayList<Integer>();
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(Integer ele: streams) {
			maxHeap.add(ele);
			minHeap.add(maxHeap.poll());
			
			if(minHeap.size() > maxHeap.size()) {
				maxHeap.add(minHeap.poll());
			}
			
			if(minHeap.size() == maxHeap.size()) {
				median.add((minHeap.peek() + maxHeap.peek())/2);
			}else {
				median.add(maxHeap.peek());
			}
		}
		
		return median;
	}

}
