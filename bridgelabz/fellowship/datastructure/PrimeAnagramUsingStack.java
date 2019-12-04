package com.bridgelabz.fellowship.datastructure;




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
			 Utility.isAnagram2(arr,count);
			
		  }

		
		
	}

