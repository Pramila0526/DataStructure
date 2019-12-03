package com.bridgelabz.fellowship.datastructure;
import com.bridgelabz.fellowship.utility.Utility;

public class Calendar2D
{
  public static void main(String[] args)
  {

	System.out.println("Enter the Month");
	int month=Utility.integerInput();
	System.out.println("Enter the year");
	int year=Utility.integerInput();
	
	String calender[][]= Utility.calendarPrinting(month,year);
	
	String monthName[]={ "January", "February", "March", "April", "May", "June", "July","August", "September", "October", "November", "December"};// return two-D array
	String mn=monthName[month-1];
	System.out.println("     ===================" +mn+ "("+month+ ") :"  +year+"===================");
	System.out.println();
	for(int i=0;i<7;i++)
	{
		for(int j=0;j<7;j++)
		{
		System.out.print("\t"+calender[i][j]);
		
		}
		System.out.println();
		System.out.println("      -------------------------------------------------------");
	}
	

  }
}
