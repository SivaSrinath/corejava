package com.ik.trees;

import java.util.ArrayList;

public class BSTFromPreorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> preorder = new ArrayList<Integer>();
		
		preorder.add(1);
		preorder.add(0);
		preorder.add(2);
		
		BinaryTreeNode node = build_binary_search_tree(preorder);
		
		if(node.left !=null) System.out.println(node.left);
		if(node.right !=null) System.out.println(node.right);
		//System.out.println(finalResult.left +"-"+ finalResult.right);
		System.out.println(build_binary_search_tree(preorder));

	}
	
	static int idx=0;
    //static ArrayList<Integer> list;
    static BinaryTreeNode helper(ArrayList<Integer> preorder,int lower,int upper,int length){
        if(idx==length)
            return null;
        int val = preorder.get(idx);
        if(val<lower || val>upper){
            return null;
        }
        
        idx++;
        BinaryTreeNode node = new BinaryTreeNode(val);
        node.left = helper(preorder,lower,val,length);
        node.right= helper(preorder,val,upper,length);
        return node;
    }
    
    static BinaryTreeNode build_binary_search_tree(ArrayList<Integer> preorder) {
        /*BinaryTreeNode node = new BinaryTreeNode(preorder.get(0));
        int leftStart=0;
        for(int i=1;i<preorder.size();i++){
            if(preorder.get(0)<preorder.get(i)){
                leftStart=i;
                break;
            }
        }
        node.left = helper(preorder.subList(1,leftStart),0,leftStart-1);
        node.right = helper(preorder.subList(leftStart,preorder.size()),0,preorder.size()-leftStart);
        */
        //list= new ArrayList<>(preorder);
        return helper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE,preorder.size());
    }
    
    

}
