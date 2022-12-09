package com.ik.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class DutchFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//order of balls red, green, blue

	}
	
	static ArrayList<Character> dutchFlag(ArrayList<Character> balls){
		
		int p = 0;
		int red = 0;
		int blue = balls.size()-1;
		
		while(p<=blue) {
			
			if(balls.get(p) == 'R') {
				Collections.swap(balls, p, red);
				red++;
			}
			
		}
		
		return balls;
	}

}
