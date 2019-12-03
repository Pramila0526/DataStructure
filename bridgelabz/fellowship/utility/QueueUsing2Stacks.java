package com.bridgelabz.fellowship.utility;

import java.util.Stack;

public class QueueUsing2Stacks 
{
	Stack<Integer> oldStack;
	Stack<Integer> newStack;
	int topElement;
	int size;
	
	public QueueUsing2Stacks()
	{
		oldStack=new Stack<Integer>();
		newStack=new Stack<Integer>();
		topElement=-1;
		size=-1;
	}
	
	@SuppressWarnings("deprecation")
	public boolean enqueue(int string)
	{
		boolean flag=true;
		try
		{
			newStack.push(new Integer(string));
		}
		catch(Exception e)
		{
			
			System.out.println("Error Occured");
			return false;
		}
		return flag;
	}
	public int dequeue()
	{
		topElement=-1;
		if(oldStack.empty())
		{
			while(!newStack.empty())
			{
				topElement=newStack.peek();
				oldStack.push(topElement);
				newStack.pop();
			}
		}
		if(!oldStack.empty())
		{
			Integer i=oldStack.peek();
			topElement=i.intValue();
			oldStack.pop();
		}
		return topElement;
	}
	
	public boolean isEmpty()
	{
		if(oldStack.empty() && newStack.empty())
		{
			return true;
		}
		else
		{
			
				return false;
		}
	}
	public int size()
	{
		 size=oldStack.size()+newStack.size();
		 return size;
	}
	public static void main(String[] args)
{
		QueueUsing2Stacks qs=new QueueUsing2Stacks();
				System.out.println("Is Queue Empty" +qs.isEmpty());
				System.out.println("Enqueue elemnts in the queue");
				for(int i=0;i<=6;i++)
				{
				   qs.enqueue(Utility.integerInput());
					System.out.println("Enqueued element" +Utility.integerInput()+ "into the queue");
				}
				int size=qs.size();
				for(int i=0;i<size;i++)
				{
					System.out.println("Dequeued" +qs.dequeue()+ "from queue");
					
				}
	}
}
