package com.ik.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsWithDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(get_distinct_subsets("aab"));
	}
	
	static ArrayList<String> get_distinct_subsets(String s) {
        // Write your code here.
        char[] input = s.toCharArray();
        
        Arrays.sort(input);
        
        
        ArrayList<String> result = new ArrayList<String>();
        
        helper(input, 0, new StringBuilder(), result);
        return result;
    }
    
    static void helper(char[] input, int ind, StringBuilder partialSolution, ArrayList<String> result){
        
        if(ind == input.length){
            result.add(new String(partialSolution.toString()));
            //return;
        }else{
        	
        	//include
            partialSolution.append(input[ind]);
            helper(input, ind+1, partialSolution, result);
            partialSolution.deleteCharAt(partialSolution.length()-1);
            
            
        	while(ind < input.length-1 && input[ind] == input[ind+1]){
                ind++;
            }
            
        	//exclude
            helper(input, ind+1, partialSolution, result);

            
            //[aab, aa, ab, a, b, ]
            
        }
        //return;
    }

}
