package com.bridgelabz.fellowship.utility;



public  class QueueUsingLLUtility<T>
{
	       
		public T data;                  
		public QueueUsingLLUtility<T> next;           
		public QueueUsingLLUtility<T> previous;       
	                                    
		public QueueUsingLLUtility() 
		 {                
			this.next = null;           
			this.previous = null;       
		}                             
	                                    
		public QueueUsingLLUtility(T d) 
		{           
			this.data = d;            
			this.next = null;           
			this.previous = null;       
		}                               
                              
	   


	@SuppressWarnings("rawtypes")
	static QueueUsingLLUtility front;                     
	@SuppressWarnings("rawtypes")
	static QueueUsingLLUtility rear;   
	  static int size=0;
	  @SuppressWarnings("rawtypes")
	private static QueueUsingLLUtility Node;    

	 //Adding the element at the End
	 
	 @SuppressWarnings("unchecked")
	public static<T> void enqueueRear(T data1)
	 {
		 if (front == null)                                                                                        
			{                                                                                                         
			 QueueUsingLLUtility<T> Node = new QueueUsingLLUtility<T>(data1);                                                                      
				front = Node;                                                                                         
				rear = front;                                                                                         
			} else                                                                                                    
			{                                                                                                         
				 
				QueueUsingLLUtility<T> Node1 = new QueueUsingLLUtility<T>(data1);                                                                     
				rear.next = Node1;                                                                                    
			   Node1.previous = rear;                                                                                
				rear = Node1;                                                                                         
			}                                                                                                         
			size++;            
	 }
	 
    //Adding the element at the Front/
	
	 @SuppressWarnings("unchecked")
	public static<T> void enqueueFront(T data1)
	 {
		
		if(front==null)
		 {
			 front.data=data1;
			 rear=front;
		 }
		else
		{
			Node=null;
			Node.data=data1;
			Node.next=front;
			front.previous=Node;
		    front=Node;
		}
		size++;
	 }
	 
	
	 
	//Removing the element at the Front
	 
	 @SuppressWarnings("unchecked")
	public static<T> T dequeueFront() {                                                                                      
			T temp = null;                                                                                             
			if (front == null) 
			{                                                                                      
				System.out.println("**UnderFlow**No Elements to delete");                                                          
			}
			else 
			{                                                                                                  
				temp = (T) front.data;                                                                                     
				front = front.next;                                                                                   
			}                                                                                                         
			size--;                                                                                                   
			return temp;                                                                                               
		}      
	 
	 //Removing the element at the Rear
	 
	 @SuppressWarnings("unchecked")
	public static<T> T dequeueRear()                                                                                         
		{                                                                                                             
			T temp = null;                                                                                             
			if (front == null)                                                                                        
			{                                                                                                         
				System.out.println("**UnderFlow**No Elements to delete");                                                           
			} else                                                                                                    
			{                                                                                                         
				temp = (T) rear.data;                                                                                      
				rear = rear.previous;                                                                                 
				rear.next = null;                                                                                     
			}                                                                                                         
			size--;                                                                                                   
			return temp;                                                                                               
		}         
	
	 
	 //Checking whhether the queue is empty or not
	 
	 public boolean empty()
	 {
		 if(front==null)
			 return true;
		 else
			 return false;
		
   }
	 //Mothod to Print the Size
	 
	 public static int size()
	 {
		 return size;
	 }
	 
}