package com.bridgelabz.fellowship.datastructure;

public class Queue<T> 
{
	static int max = 10;
	static int front = -1;
	static int rear = -1;
    static int a[]=new int[max];
    
    public static void enqueueFront(int data)
	{
		if(rear==max-1)
		{
			System.out.println("**Queue is Full**Cannot Perform Enqueue Operation**");
		}
		else
		{
			a[front]=data;
			
		}
	}
	public static<T> void enqueueRear(T data)
	{
		if (rear == max - 1) 
		{
			System.out.println("**Queue Overflow**");
		}
		else
		{
		if(front==-1)
		{
			front=0;
		
		}
			rear++;
			a[rear]=(int) data;
		}
			
	}
	public static<T> void dequeueFromFront()
	{
		if(front==-1 || front>rear)
		{
			System.out.println("**Queue Underflow**");
		}
		else
		{
			front++;
		}
	}
	public static<T> void dequeueFromRear()
	{
		if(rear==-1 )
		{
			System.out.println("**Queue Underflow**No Elements to delete");
		}
		else
		{
			rear--;
		}
	}
	public static void display()
	{
		if(rear==-1)
		{
			System.out.println("**Queue is Empty**");
			
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(a[i]+ " | ");
			}
		}
	}
	public static void main(String[] args) 
	{
		Queue.enqueueRear(5);
		Queue.enqueueRear(6);
		Queue.enqueueRear(7);
		Queue.enqueueRear(8);
		System.out.println("\n======Queue after Enqueue operation======");
		Queue.display();
		Queue.dequeueFromFront();
		System.out.println();
		System.out.println("\n======Queue After Dequeue From Front operation======");
		Queue.display();
		
		Queue.dequeueFromRear();
		System.out.println();
		System.out.println("\n======Queue After Dequeue From Rear operation======");
		Queue.display();
		System.out.println();
	
	}
}
