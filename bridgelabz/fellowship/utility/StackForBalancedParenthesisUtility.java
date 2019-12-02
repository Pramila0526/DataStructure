package com.bridgelabz.fellowship.utility;

public class StackForBalancedParenthesisUtility<T>
{
	
		   static int size=10;
		   static int top=-1;
		   static char a[]=new char[size];
		
		public static<T> void push(T data)
		{
			if(top==size-1)
			{
				System.out.println("**Stack is Full**Cannot Perform Push Operation**");
			}
			else
			{
				top++;
				a[top]=(char) data;
			}
		}
		
		public static void pop()
		{
			if(top==-1)
			{
				System.out.println("**Stack is Empty**Cannot Perform Pop Operation**");
			}
			else
			{
				top--;
			}
		}
		
		public void display()
		{
			if(top>0)
			{
			for(int i=top;i>=0;i--)
			{
				System.out.println(a[i]+ "\n---");
			}
			}
			else
			{
				System.out.println("**No Elements to Display**");
			}
		}
		
		public static<T> char peek()
		{
			return a[top];
		}
		
		public static boolean empty()
		{
			
			return  (top==-1)? true :false;
		}
		
		
		public static<T>  boolean check(T s) 
		{
		
		for(int i=0;i<((String) s).length();i++)
		{
		char p=((String) s).charAt(i);
		
		if(p=='(' || p=='{' || p=='[')
		{
			push(((String) s).charAt(i));
		}
		
		 if((p==')' || p=='}' || p==']') &&(!empty()))
		{
			
			
			pop();
		}
		 else if(empty()) 
			{
				System.out.println("Not Balanced"); 
				break;
				
			}
		}
		

		return false;
		}
		
		 public static boolean matchingPair(String s)
			{
			 for(int i=0;i<((String) s).length();i++)
				{
				char p=((String) s).charAt(i);
				if(p=='(' || p=='{' || p=='[')
				{
					push(((String) s).charAt(i));
				}
					
				 if((p==')' || p=='}' || p==']') )
					{
						if(empty())
						{
							return false;
						}
						else 
				        {
					
							pop();
							
				        }
					}
			}
						if(empty())
						{	
							return true;
						}		
							else
							{
							return false;
						    }
		}
							

	}
