package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.Utility;

public class StackBalanced
{
		
		public static<T> void main(String[] args) 
		{
			
			
			Utility.StackBalancedParenthesis.check("{((a+b)(b=c))})");
			if(Utility.StackBalancedParenthesis.empty())
			{
				System.out.println("Parenthesis are Balanced");
				
			}
			else
			{
				System.out.println("Parenthesis are not Balanced");
			}
			
		}
			
	}

		


