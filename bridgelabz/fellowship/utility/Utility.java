package com.bridgelabz.fellowship.utility;
import java.util.*;

public class Utility {

	 static Scanner sc;

	public static int integerInput() {
		sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static double doubleInput() {
		sc = new Scanner(System.in);
		return sc.nextDouble();
	}

	public static String stringInput() {
		sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static int longInput() {
		sc = new Scanner(System.in);
		return sc.nextInt();
	}


/*****Leap Year****/

public static boolean leap2(int year) {
	
	boolean leap = false;
	int length = String.valueOf(year).length();
	// if(year>999 && year <10000)
	if (length == 4) {
		if (year % 4 == 0 || year % 400 == 0)// ||year%100!=0 ||year%10!=0)
		{
			leap = true;
		} else if (year % 100 == 0 || year % 10 == 0) {
			leap = false;
		}
		
	}
	return leap;
}

/*****Day Of Week****/

public static int dayOfWeek(int Date, int month, int Year) {


	int y0 = Year - (14 - month) / 12;
	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	int m0 = month + 12 * ((14 - month) / 12) - 2;
	int d0 = (Date + x + 31 * m0 / 12) % 7;
	return d0;
	
}

/*****Prime in Range or Limit*****/
public static int[] primeSeries(int num)
{
	   int i =0;
    int j =0;
    int k=0;
   
    int a[]=new int[num];
    for (i = 1; i <=num ; i++)         
    { 		  	  
 	   int counter=0; 	  
 	   for(j =i; j>=1; j--)
 	   {
 		   if(i%j==0)
 		   {
 			   counter = counter + 1;
 		   }
 	   }
 	   if (counter ==2)
 	   {
 		  
 		 a[k]=i;
 		 
 		   k++;
 	   }	
   }
	return a;

}
/******Queue Using LinkedList*****/

@SuppressWarnings("hiding")
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


public static<T> boolean isStringAnagram(T s12, T s22) 
{
        boolean status;
	if (((String) s12).length() != ((String) s22).length())
	{
		return false;
	}
	char[] s1 = ((String) s12).toLowerCase().toCharArray();
	char[] s2 = ((String) s22).toLowerCase().toCharArray();
	Arrays.sort(s1);
	Arrays.sort(s2);
	status=Arrays.equals(s1,s2);
	return status;
	
}
/*****prime in 2d****/

  public static int[][] primeIn2D(int primeNum[],int row,int column)
	{
		int array[][]=new int[row][column];	
		int k=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=primeNum[k++];
			}
		}
		return array;
		
		
	}
 
	
/*****Calendar For Queue*****/
  public static int[][] calenderQueue(int month, int year)
  {
		int year1, month1, x, day = 1, day1;

		year1 = year - (14 - month) / 12;
		x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
		month1 = month + 12 * ((14 - month) / 12) - 2;
		day1 = (day + x + (31 * month1) / 12) % 7;
		
		
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monthDay = 0;
		
		for (int i = 0; i < monthDays.length; i++) 
		{
			if (i == month - 1) {
				monthDay = monthDays[i];
			}
		}
		
		
		int[][] totalDays = new int[6][7];
		boolean leap = leap2(year);
		if (leap && month == 1) 
		{
			monthDay = 29;
		}
		
		int k = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) 
			{
				if (i == 0 && j < day1)
				{
					totalDays[i][j] = -1;
				}
				else if (k <= monthDay) {
					totalDays[i][j] = k;
					k++;
				} 
				else
				{
					totalDays[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 12; i++) 
		{
			if (month == i + 1) 
			{
				System.out.print("====="+monthName[i] + " " + year+ "=====");
			}
		}
		System.out.println();
		return totalDays;

	}
  /*****Calendar Printing Logic*****/
  public static String[][] calendarPrinting(int month, int year) 
	{

		String calender[][] = new String[7][7];
		int day = dayOfWeek(1, month, year);
		String dayofWeek[] = { "Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Sat" };
		int daysofmonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days = daysofmonth[month-1];
		if(month==2 && Utility.leap2(year))
		{
			daysofmonth[month]=29;
		}
		int k = 1;
		int flag = 0;
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j < 7; j++) 
			{
				if (k <= days) 
				{
					if (i == 0)
					{
						calender[i][j] = dayofWeek[j];
					} else if (day == j) 
					{
						calender[i][j] = String.valueOf(k);
						day++;
						k++;
						flag = 1;
					} else
					{
						calender[i][j] = "";
					}
				}
				else
				{
					calender[i][j]="";
				}

			}
			if (flag == 1) 
			{
				day = 0;
			}

		}
		return calender;
	}
	
}