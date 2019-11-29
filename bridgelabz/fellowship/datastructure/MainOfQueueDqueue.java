package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.Utility;


public class MainOfQueueDqueue
{
	public static void main(String[] args) 
	 {
		
	QueueUsingLL<Character> q=new QueueUsingLL<Character>();
		
		
		System.out.println("Enter the String");
		String s=Utility.stringInput();
		for(int i=0;i<s.length();i++)
		{
		char myString=s.charAt(i);
		q.enqueueRear(myString);
	    }
		
		boolean flag=true;
		while(q.size()>1)
		{
		if (q.dequeueFront() != q.dequeueRear())
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
