package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.BstUtility;
import com.bridgelabz.fellowship.utility.Utility;

public class BinarySearchTree<T> {

	
	public static void main(String[] args) 
	{
		
		//BinarySearchTree<?> tree=new BinarySearchTree();
		
		System.out.println("Enter the Number of Nodes");
		int n=Utility.integerInput();
		
		int a[]=new int[n];
		
		System.out.println("Enter the nodes");
		for(int i=0;i<n;i++)
		{
			a[i]=Utility.integerInput();

		}
		
		System.out.println("Possible Number of Nodes are");
		
		System.out.println(BstUtility.possibleNodes(n)); 
		
		
	}

	
}
