package com.bridgelabz.fellowship.datastructure;

public class Stack<T>
{
	  int size=10;
	  int top=-1;
	  int a[]=new int[size];
	
	public void push(int data)
	{
		if(top==size-1)
		{
			System.out.println("**Stack is Full**Cannot Perform Push Operation**");
		}
		else
		{
			top++;
			a[top]=data;
		}
	}
	public void pop()
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
			System.out.println("**No ELements to Display**");
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack st=new Stack();
		st.push(5);
		st.push(6);
		st.push(7);
		System.out.println();
		System.out.println("=====Elements After PUSH Operation=====");
		System.out.println();
		st.display();
		
		st.pop();
		System.out.println();
		System.out.println("=====Elements After POP Operation=====");
		System.out.println();
		st.display();
		
		}
}

