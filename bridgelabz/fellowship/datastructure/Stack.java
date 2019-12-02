package com.bridgelabz.fellowship.datastructure;

public class Stack<T>
{
	  static int size=10;
	  static int top=-1;
	  static String a[]=new String[size];
	
	public static<T> void push(T s1)
	{
		if(top==size-1)
		{
			System.out.println("**Stack is Full**Cannot Perform Push Operation**");
		}
		else
		{
			top++;
			a[top]=(String) s1;
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
	public static void display()
	{
		if(top>0)
		{
		for(int i=top;i>=0;i--)
		{
			System.out.println("|" +a[i]+ "|");
			System.out.println("---");
		}
		}
		else
		{
			System.out.println("**No ELements to Display**");
		}
	}
	public static void main(String[] args) {
		Stack.push(5);
		Stack.push(6);
		Stack.push(7);
		System.out.println();
		System.out.println("=====Elements After PUSH Operation=====");
		System.out.println();
		Stack.display();
		
		Stack.pop();
		System.out.println();
		System.out.println("=====Elements After POP Operation=====");
		System.out.println();
		Stack.display();
		
		}
}

