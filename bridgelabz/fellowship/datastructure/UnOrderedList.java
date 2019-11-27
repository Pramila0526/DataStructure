package com.bridgelabz.fellowship.datastructure;

import java.io.FileWriter;
import java.io.IOException;

public class UnOrderedList<T>
{
	Node head;
	public class Node
	{
		T data;
		Node next;
		Node(T data2)
		{
			data=data2;
			next=null;
		}
	}
	
	/***Inserting an Elements*****/
	
	public  void insert(T data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		if(head==null)
		{
			head=new_node;
		}
		else
		{
		Node temp= head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new_node;
	}
	}
	
	/****Deleting Elements*****/
	
	public void delete(T data)
	{
		Node temp=head;
		Node previous=null;
		
		if(temp!=null && temp.data==data)
		{
			head=temp.next;
		}
		else
		{
			while(temp!=null && temp.data!=data)
			{
				previous=temp;
				temp=temp.next;
			}
			if(temp==null)
			{
				return;
			}
			previous.next=temp.next;
		}
	}
	
	/*****Search Operation
	 * @return ****/
	
	public String search(T data)
	{

		Node temp=head;Node previous=null;
		boolean flag=false;
		if(temp!=null && temp.data==data)
		{
			head=temp.next;
		}
		else
		{
			while(temp!=null)
			{
				if(temp.data==data)
				flag=true;
				temp=temp.next;
			}
		}
		if(flag)
		{
			System.out.println("\n" +data+ " is Present..so Deleting**");
			delete(data);
		}
		else
		{
			System.out.println("\n" +data+ " is not in the File..So inserting!!");
			insert(data);
		}
		return null;
	}
	/****Displaying Data*****/
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+ "-->");
			temp=temp.next;
		}
		}
	}
	
	/***Main Method****/
	
	public static void main(String args[])
	{
		UnOrderedList uo=new UnOrderedList();
		System.out.println();
		uo.insert("pramila");
		uo.insert("xyz");
		uo.insert("pqr");
		System.out.println("========Elements are=========");
		 uo.display();
		//System.out.println("Elements after Delete operation");
	   //uo.delete("xyz");
		//uo.display();
		 System.out.println();
		System.out.println("\nElements after Search Operation");
		uo.search("xyz");
		uo.search("rty");
        uo.display();		
     /* System.out.println("Enter Number of elements");
      int n=Utility.IntegerInput();
      String data[]=new String[n];
      System.out.println("Enter the data in the Linked List");
      for(int i=0;i<n;i++)
      {
    	  uo.insert(data[i]);
    
      }*/
     
	}
}
