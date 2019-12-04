package com.bridgelabz.fellowship.utility;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class PalindromeChecker 
{
   
	public static void main(String[] args) 
	{
	int a[]= new int[]{10,20,20,10};
	@SuppressWarnings({ "rawtypes", "unchecked" })
	LinkedList ll=new LinkedList(Arrays.asList(a));
	@SuppressWarnings("rawtypes")
	Iterator iterator=ll.iterator();
	
	while(iterator.hasNext())
	{
	System.out.println(iterator.next());	
	}
	
}
	}

