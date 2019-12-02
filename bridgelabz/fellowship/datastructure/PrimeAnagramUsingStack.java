package com.bridgelabz.fellowship.datastructure;



import com.bridgelabz.fellowship.utility.StackUtility;
import com.bridgelabz.fellowship.utility.Utility;

public class PrimeAnagramUsingStack<T> {
	
		public static<T> void main(String[] args)
		  {
			  System.out.println("Enter the number");
			  int num=Utility.integerInput();
			  int arr[] =Utility.primeSeries(num);
			  int count=0;
			
			  int i=0;
			 
			  while(arr[i]>0)
			  {
				  count++;
				  i++;
			  }
			 isAnagram(arr,count);
			
		  }

		@SuppressWarnings("unchecked")
		public static<T> void isAnagram(int[] arr,int count)
		{
		 T s1,s2;
		 int count1=0;
		 boolean flag;
		
		  for(int i=0;i<count;i++)
		  {	    
				  s1= (T) String.valueOf(arr[i]);
				  for(int j=i;j<count;j++)
				  {   if(i!=j)
				  	{ 
					 	//System.out.println(i+" "+j);
						  s2=(T) String.valueOf(arr[j]);
						  flag=Utility.isStringAnagram(s1, s2);
						  if(flag==true)
						  {  
							  count1=count1+2;
						  	 StackUtility.push(s1);
						  	 StackUtility.push(s2);
						 
						  }
						  
				  		
	                   }			  
				
				  }
				  
	       }
		  
		  StackUtility.printStack();
		}
	}

