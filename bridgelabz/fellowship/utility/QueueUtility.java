package com.bridgelabz.fellowship.utility;

public class QueueUtility<T>
{

		
			static Node<?> head;
			
			@SuppressWarnings("rawtypes")
			public static class Node<T>
			{
				T data;
				
				Node next;
				
				public Node(T data)
				{
					this.data=data;
					this.next = null;
				}
			}
			
			
				@SuppressWarnings({ "rawtypes", "unchecked" })
			public static <T> void enqueue(T data)
			{
				
				Node node = new Node(data);
				if(head==null)
				{
					head = node;
				}
				else
				{
					Node temp = head;
					while(temp.next!=null)
					{
						temp=temp.next;
					}
					temp.next=node;
				
				}
			}
			
			
			@SuppressWarnings({ "rawtypes", "unchecked", "hiding" })
			public <T> T dequeue()
			{
				T data=null;
				if(!isEmpty())
				{
				Node ptr =head;
				data = (T) ptr.data;
				head = ptr.next;
				}else {
					System.out.println("Queue is Empty");
				}
				return data;
			}
			
			public static boolean isEmpty()
			{
				if(head==null)
					return true;
				return false;
			}
			
			@SuppressWarnings({ "rawtypes", "unchecked", "hiding" })
			public <T> void enqueueFront(T data)
			{
				
				Node node = new Node(data);
				if(head==null)
				{
					head = node;
				}else {
					Node temp = head;
					
					temp.next = temp;
					head = temp;
				}
			}
			
			
			
			
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public static <T> void enqueueRear(T data)
			{
				
				Node node = new Node(data);
				if(head==null)
				{
					head = node;
				}else {
					Node temp = head;
					
					while(temp.next!=null)
					{
						temp=temp.next;
					}
					temp.next=node;
				}
			}
		
			
			
			
			@SuppressWarnings({ "rawtypes" })
			public static void printQueue()
			{
				if(!isEmpty())
				{
					Node temp = head;
					
					while(temp!=null)
					{
						System.out.print(temp.data+" | ");
						temp= temp.next;
					}
				}else {
					System.out.println("Queue is empty");
				}
			}
			
		
		
			
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public static <T> T dequeueFront()
			{
				T data=null;
				if(!isEmpty())
				{
				Node temp = head;
				data = (T) temp.data;
				head = temp.next;
				}else {
					System.out.println("Queue is empty");
				}
				return data;
			}
			
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public static <T> T dequeueRear()
			{
				T data=null;
				if(!isEmpty())
				{
					Node temp = head;
					Node index = temp;
					while(temp.next!=null)
					{
						index = temp;
						temp=temp.next;
					}
					data =(T) temp.data;
					index.next=null;
				}else {
					System.out.println("Queue is empty");
				}
				return data;
			}
			
			@SuppressWarnings({ "rawtypes", "hiding" })
			public <T> boolean search(T x)
			{
				Node temp = head;
				while(temp!=null)
				{
					if(temp.data.equals(x))
					{
						return true;
					}
					temp=temp.next;
				}
				return false;
			}

			
			@SuppressWarnings({ "rawtypes"})
			public int size()
			{
				int count=0;
				Node temp = head;
				
				while(temp!=null)
				{
					count++;
					temp= temp.next;
				}
				return count;
			}
	}


