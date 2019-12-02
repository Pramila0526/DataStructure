package com.bridgelabz.fellowship.utility;

public class OrderedList<T extends Comparable<T>> {
	Node head;

	public class Node {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
			next = null;

		}
	}

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
	public  void sort() 
	{

		Node temp = head;
		Node index = null;
		T temp1;

		if (head == null) 
		{
			return;
		} 
		else 
		{
			while (temp != null) 
			{

				index = temp.next;

				while (index != null) 
				{

			   if((temp.data).compareTo(index.data)>0)
				{
				   temp1 =  temp.data;
					temp.data = index.data;
					index.data = temp1;
				}
				index = index.next;
			}
			temp = temp.next;
		}
	}
	}
	
		public static<T> void main(String[] args) 
	{
		OrderedList<Integer> o = new OrderedList<Integer>();
		
		o.insert(3);
		o.insert(5);
		o.insert(2);
		o.insert(4);
		o.insert(1);

	    System.out.println("==========Elements are==========");
		o.display();
		o.search(2);
		o.search(6);
		System.out.println("\nElements after search Operation");
		o.display();
		System.out.println("\nElements after Sorting");
		System.out.println();
		o.sort();
		o.display();
		o.insert(10);
		o.display();
		
		}
}
