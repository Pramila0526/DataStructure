package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.Utility;

public class PrimeIn2D
{
	
public static void main(String args[])
{
	
	int row=10;   //because we want 10 prime and anagram numbers in one row 
	              //so we calculated it as 1000/100;
	
	int column=30;   //because there are maximum 25 prime numbers in 1-100 so
	              //we have set the limit as 30 for column
	
	int array[]=Utility.primeSeries(1000);
	int primeArray[][]=Utility.primeIn2D(array,row,column);
	int count=96;
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			if(primeArray[i][j]!=0 )
			System.out.print(" " +primeArray[i][j]+ " ");
			if(count<primeArray[i][j])
			{
				count=count+100;
				System.out.println();
			}
		}
	}
			
  }
}
