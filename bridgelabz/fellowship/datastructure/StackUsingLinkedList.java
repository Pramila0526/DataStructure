package com.bridgelabz.fellowship.datastructure;

public class StackUsingLinkedList<T>
{
	int size=10;
	Node top;
	class Node
	{
		T data;
		Node next;
		Node(T data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	
	public void push(T data)
	{
		Node node=new Node(data);
		if(top==null)
		{
			top=node;
			return;
		}
		node.data=data;
		node.next=top;
		top=node;
	}
	
	public void pop()
	{
		if(top==null)
		{
			System.out.println("**Stack Underflow**");
			return;
		}
		top=top.next;
	}
	public boolean isEmpty()
	{
		return (top==null)? true:false;
	}
	public T peek()
	{
		if(!isEmpty())
		{
			return top.data;
		}
		else
		{
			System.out.println("Stack is Empty");
			return null;
		}
	}
	
	public void display()
	{
		if(top==null)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			Node temp=top;
			while(temp!=null)
			{
				System.out.println("|" +temp.data+ "|" );
				System.out.println("---");
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) 
	{
		StackUsingLinkedList<Integer> sl=new StackUsingLinkedList<Integer>();
		sl.push(1);
		sl.push(2);
		sl.push(3);
		sl.push(4);
		System.out.println("Elements of Linked Stack after Push Operation");
		System.out.println();
		sl.display();
		
	    sl.pop();
		System.out.println("Elements of Linked Stack after Pop Operation");
		System.out.println();
		sl.display();
			 
		
	}
}
