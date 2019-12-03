package com.bridgelabz.fellowship.utility;

import java.io.File;
import java.io.PrintStream;

public class HashingLinkedListUtility 
{
	
	@SuppressWarnings("rawtypes")
	public Node[] hashTable;
	public int size;
	@SuppressWarnings("rawtypes")
	Node head;
	
	public HashingLinkedListUtility(int tableSize)
	{
		hashTable = new Node[tableSize];
		size=0;
	}
	
	//Code to find the remainder of entered data so that we can put our element in 
	//the proper position
	public int myhash(int value)
	{
		int hashVal=value;
		hashVal = hashVal % hashTable.length;
		return hashVal;
	}
	
/*	public boolean empty() 
	{
		return size==0;
	}*/
	
	@SuppressWarnings("unchecked")
	public void insert(int value) 
	{
		size++;
		int pos=myhash(value);
		@SuppressWarnings("rawtypes")
		Node n = new Node(value);
		if(hashTable[pos]==null)
			hashTable[pos]=n;
		else 
		{
			n.next=hashTable[pos];
			hashTable[pos]=n;
		}
	}

	//Code to remove the elements
	
	@SuppressWarnings("unchecked")
	public void remove(int value) 
	{
		int pos = myhash(value);
		@SuppressWarnings("rawtypes")
		Node temp = hashTable[pos];
		@SuppressWarnings("rawtypes")
		
		Node previous = null;
		
		Integer i = (Integer) temp.data;
		
		if(temp.data.equals(temp))
		{
			head = temp.next;
			return;
		}
		
		while(temp!=null) 
		{
			i = (Integer) temp.data;
			if(i.equals(value))
				
				break;
			
			else
				previous = temp;
			   temp=temp.next;
		}
		previous.next = temp.next;
	}
	
	//Code to display the elements
	
	public void display() 
	{
		for(int i=0;i<hashTable.length;i++) 
		{
		    System.out.print(i+"");
		    
			@SuppressWarnings("rawtypes")
			Node t = hashTable[i];
			
			while(t!=null) 
			{
				System.out.print("-->"+t.data);
				t=t.next;
			}
				System.out.println();
		}
	}
	
	//Code To write to File
	
	public void writeToFile() throws Exception 
	{
		try 
		{
		PrintStream ps = new PrintStream(new File("/home/admin94/Desktop/DataStructure(FP)/DataStructurePrograms/hashing.txt"));
		System.setOut(ps);
		
		for(int i=0;i<hashTable.length;i++) 
		{
			System.out.print(i+"");
			@SuppressWarnings("rawtypes")
			Node temp =hashTable[i];
		    while(temp!=null)
		   {
			  System.out.print(temp.data+"");
			  temp=temp.next;
		   }
		   System.out.println();
		 }
		}
		catch(Exception e) 
		{
			
			System.out.println("Oops!, Something went wrong");
		}
	}
	
	//Code to search the element
	public void search(int value) 
	{
		
		int position = myhash(value);
		Integer data = value;
		int k=0;
		@SuppressWarnings("rawtypes")
		Node temp = hashTable[position];
		while(temp!=null) 
		{
			if(temp.data.equals(data)) 
			{
				k++;
				
				break;
			}
			temp=temp.next;
		}
		if(k>0) 
		{
			remove(value);
			System.out.println("Data found at table position "+position);
			
		}
		else 
		{
			insert(value);
			System.out.println("Data not Found");
			
		}
	}
	
}