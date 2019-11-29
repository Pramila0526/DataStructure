package com.bridgelabz.fellowship.datastructure;



public  class QueueUsingLL<T>
{
	       
		public T data;                  
		public QueueUsingLL<T> next;           
		public QueueUsingLL<T> previous;       
	                                    
		public QueueUsingLL() 
		 {                
			this.next = null;           
			this.previous = null;       
		}                             
	                                    
		public QueueUsingLL(T d) 
		{           
			this.data = d;            
			this.next = null;           
			this.previous = null;       
		}                               
                              
	   


	QueueUsingLL<T> front;                     
	   QueueUsingLL<T> rear;   
	  int size=0;
	  private QueueUsingLL<T> Node;    

	 //Adding the element at the End
	 
	 public void enqueueRear(T data1)
	 {
		 if (front == null)                                                                                        
			{                                                                                                         
			 QueueUsingLL<T> Node = new QueueUsingLL<T>(data1);                                                                      
				front = Node;                                                                                         
				rear = front;                                                                                         
			} else                                                                                                    
			{                                                                                                         
				 
				QueueUsingLL<T> Node1 = new QueueUsingLL<T>(data1);                                                                     
				rear.next = Node1;                                                                                    
				Node1.previous = rear;                                                                                
				rear = Node1;                                                                                         
			}                                                                                                         
			size++;            
	 }
	 
    //Adding the element at the Front/
	
	 public  void enqueueFront(T data1)
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
	 
	 public T dequeueFront() {                                                                                      
			T temp = null;                                                                                             
			if (front == null) 
			{                                                                                      
				System.out.println("**UnderFlow**No Elements to delete");                                                          
			}
			else 
			{                                                                                                  
				temp = front.data;                                                                                     
				front = front.next;                                                                                   
			}                                                                                                         
			size--;                                                                                                   
			return temp;                                                                                               
		}      
	 
	 //Removing the element at the Rear
	 
	 public T dequeueRear()                                                                                         
		{                                                                                                             
			T temp = null;                                                                                             
			if (front == null)                                                                                        
			{                                                                                                         
				System.out.println("**UnderFlow**No Elements to delete");                                                           
			} else                                                                                                    
			{                                                                                                         
				temp = rear.data;                                                                                      
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
	 
	 public int size()
	 {
		 return size;
	 }
	 
}