package com.bridgelabz.fellowship.datastructure;

import java.util.NoSuchElementException;
import java.util.Scanner;


class LinkedQueue1<T>
{
    protected static Node front;
	protected static Node rear;
    public static int size;
 
  
    public LinkedQueue1()
    {
        front = null;
        rear = null;
        size = 0;
    }    
  
    public boolean isEmpty()
    {
        return front == null;
    }    
   
    public int getSize()
    {
        return size;
    }    
    
    public static<T> void insert(int calendar)
    {
        Node new_node = new Node();
        if (rear == null)
        {
            front = new_node;
            rear = new_node;
        }
        else
        {
            rear.setLink(new_node);
            rear = rear.getLink();
        }
        size++ ;
    }    
    
    public int remove()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node temp = front;
        front = temp.getLink();        
        if (front == null)
            rear = null;
        size-- ;        
        return temp.getData();
    }    
   
    public int peek()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }    
    
    public void display()
    {
        
        if (size == 0)
        {
            System.out.print("Empty");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getLink() )
        {
        
            System.out.print(ptr.getData());
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
}

 
/*  Class LinkedQueueImplement  */
public class LinkedQueueForCalendar
{    
    @SuppressWarnings("static-access")
	public static void main(String[] args)
    {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); 
       
        @SuppressWarnings("rawtypes")
		LinkedQueue lq = new LinkedQueue();            
       
        char ch;        
        do
        {
            System.out.println("====Operations of Queue====");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check empty");
            System.out.println("5. Size");
            System.out.println("6. Exit");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter the Element to Insert");
                lq.insert( scan.nextInt() );
                break;                         
            case 2 : 
                try 
                {
                    System.out.println("Removed Element:-"+ lq.remove());
                }
                catch (Exception e)
                {
                    System.out.println("Error**" + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element is:-"+ lq.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = "+ lq.isEmpty());
                break;
 
            case 5 : 
                System.out.println("Size = "+ lq.getSize());
                break;  
            
            case 6:
            	System.exit(0);
            default : 
                System.out.println("Invalid Choice");
                break;
            }                
             
            lq.display();
 
            System.out.println("\nEnter y or n if you want to continue(y for yes .. n for No)");
            ch = scan.next().charAt(0);            
        } 
        while (ch == 'Y'|| ch == 'y');                                                            
    }

	
	

	
}