package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.Utility;

public class PrimeAnagram2D
{
	public static void main(String[] args)
	  {
		System.out.println("Enter the Limit");
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

	public static void isAnagram(int a[],int count)
	{
	 String s1 = null,s2 = null;
	 int count1=0;
	 @SuppressWarnings("unused")
	int p=0;
	 boolean status;
	
	  for(int i=0;i<count;i++)
	  {	    
			  s1= String.valueOf(a[i]);
			  for(int j=i;j<count;j++)
			  {   if(i!=j)
			  	{ 
				 	
					  s2=String.valueOf(a[j]);
					  status=Utility.isStringAnagram(s1, s2);
					  if(status==true)
					  {   count1=count1+2;
					  	
					  	 System.out.print(s1+ " ");
					  	 p++;
					  	 System.out.print(s2+ " ");
					  	 p++;
					  	if((i+j)%2==0)
					  	{
					  		p+=100;
					  		System.out.println();
					  	}
					  }
				   }
			    }
	        }  
	  }

}