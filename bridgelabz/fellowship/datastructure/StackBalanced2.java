package com.bridgelabz.fellowship.datastructure;


import com.bridgelabz.fellowship.utility.StackBalancedWay2;
import com.bridgelabz.fellowship.utility.Utility;

public class StackBalanced2
{
	public static void main(String[] args) 
	{
		
	
	System.out.println("Enter the String");
	String s=Utility.stringInput();
	char a2[]=s.toCharArray();
	if(StackBalancedWay2.matchingPair(a2))
	{
		System.out.println("Parenthesis are Balanced!!!");
	}
	else
	{
		System.out.println("***Parenthesis are not Balanced***");
	
	}

}}
