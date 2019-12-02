package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.QueueUsingLLUtility;
import com.bridgelabz.fellowship.utility.Utility;


public class PalindromeChecker
{
	public static void main(String[] args) 
	 {
		
	//QueueUsingLL<Character> q=new QueueUsingLL<Character>();
		
		
		System.out.println("Enter the String");
		String s=Utility.stringInput();
		for(int i=0;i<s.length();i++)
		{
		char myString=s.charAt(i);
		QueueUsingLLUtility.enqueueRear(myString);
	    }
		
		boolean flag=true;
		while(QueueUsingLLUtility.size()>1)
		{
		if (QueueUsingLLUtility.dequeueFront() != QueueUsingLLUtility.dequeueRear())
				{
			    flag=false;
			    break;
				}	
		
		}
		if(flag)
		{
			System.out.println("!!String is Palindrome!!!");
			
		}
		else
		{
			System.out.println("**String is not Palindrome**");
			 
		}	
	 }
}
