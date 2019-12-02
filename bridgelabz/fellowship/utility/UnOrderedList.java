package com.bridgelabz.fellowship.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;




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

		Node temp=head;
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
	
	public static String readFromFile(String file)
	{
		String text=" ";
		try {
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(new File(file));
		while(sc.hasNext())
		{
			text+=sc.next()+"";
		}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File doesn't Exists");
		}
		return text;
		
	}
	
	@SuppressWarnings({ "resource", "unused" })
	public static String[] arrayToFile(String file)
	{
		int count=0;
		try
		{
			Scanner sc=new Scanner(new File(file));
			
			while(sc.hasNext())
			{
				sc.next();
				count++;
				
			}
			String[] fileA=new String[count];
			for(int i=0;i<fileA.length;i++)
			{
			Scanner sc1=new Scanner(new File(file));
			{
				fileA[i]=sc1.next();
			}
			return fileA;
			
		}
		}
			catch(FileNotFoundException e)
			{
				return null;
			}
		//return fileA;
		return null;
		
			
		}
	 
	/***Main Method****/
	
	public static void main(String args[])
	{
		UnOrderedList<String> uo=new UnOrderedList<String>();
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
    
	}
}
