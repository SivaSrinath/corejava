package com.ik.recursion;

import java.util.ArrayList;

public class Nchoosek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println(find_combinations(5,2));
	}
	
	static ArrayList<ArrayList<Integer>> find_combinations(Integer n, Integer k) {
        // Write your code here.
        
        ArrayList<ArrayList<Integer>> result = new  ArrayList<>();
      
        helper(n, k, 0, new ArrayList<>(), result);
        
        return result;
    }
    
    
    static void helper(int n, int k, int spIdx, ArrayList<Integer> partialSolution, ArrayList<ArrayList<Integer>> result){

        if(partialSolution.size() == k){
            result.add(new ArrayList<>(partialSolution));
        } else if(spIdx < n){
            
        //exclude
        helper(n,k,spIdx+1,partialSolution,result);
        
        //include
        partialSolution.add(spIdx+1);
        helper(n,k,spIdx+1,partialSolution,result);
        partialSolution.remove(partialSolution.size()-1);
      }
        
    }

}
