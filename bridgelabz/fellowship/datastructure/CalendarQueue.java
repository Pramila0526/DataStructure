package com.bridgelabz.fellowship.datastructure;


import com.bridgelabz.fellowship.utility.Utility;

public class CalendarQueue 
{
	@SuppressWarnings({"rawtypes", "static-access" })
	public static void main(String[] args)
	{
		System.out.println("Enter the month"); 
		int month =Utility.integerInput();
		System.out.println("Enter the year");
		int year = Utility.integerInput();
		int[][] calendar = Utility.calenderQueue(month,year);
		String[] days = {"S","M","T","W","Th","F","S"};
		for(int i=0;i<days.length;i++)
		System.out.print(days[i]+"  ");
		System.out.println();
		LinkedQueue1 list[][]= new LinkedQueue1[7][7];
		for(int i=0;i<7;i++)
			for(int j=0;j<7;j++)
		{
				list[i][j]=new LinkedQueue1();
		}
	 for(int i=0;i<6;i++) 
		{
				
		for(int j=0;j<7;j++) 
		{
					
		(list[i][j]).insert(calendar[i][j]);
		}
			}
			for(int i=0;i<7;i++)
			{
				
				for(int j=0;j<7;j++) 
				{
				System.out.println("-----------------------");
				list[i][j].display();
				}
			}
			System.out.println("=========================");
			
		
		
		
	}
}