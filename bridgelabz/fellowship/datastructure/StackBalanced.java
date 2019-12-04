package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.Utility;

import com.bridgelabz.fellowship.utility.StackForBalancedParenthesisUtility;


public class StackBalanced
{
		
		public static<T> void main(String[] args) 
		{
			
			System.out.println("Enter the String");
			String ch=Utility.stringInput();
			StackForBalancedParenthesisUtility.check(ch);

			if(StackForBalancedParenthesisUtility.empty())
			{
				System.out.println("Parenthesis are Balanced!!!");
				
			}
			else
			{
				System.out.println("***Parenthesis are not Balanced***");
			}
			
		}
			
	}

		


