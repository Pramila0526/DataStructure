package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.Utility;

public class Calendar 
{
	
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub	
			System.out.println("Please Enter the year");
			int year = Utility.integerInput();
			
			System.out.println("Please Enter the Month");
			int month = Utility.integerInput();

			//Array for Month
			String[] months= {"January","February","March","April","May","June","July"
					           ,"August","September","October","November","December"};

			//array for days
			int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

			//Checking for leap year 
			if(month==2 && Utility.leap2(year))
			{
				days[month]=29;
			}
       
		
		    
	        System.out.println("====================="+months[month-1]+ " "+year+ "=====================");
	
			System.out.println("\nSunday|Monday|Tuesday|Wednesday|Thurday|Friday|Saturday");

			System.out.println("=======================================================");
			//starting day
			int d= Utility.dayOfWeek(1,month, year);

			//printing calendar
			for(int i=0;i<d;i++)
			{
				System.out.print("	");
			}
			for(int i=1;i<=days[month];i++)
			{
				System.out.printf("%d	",i);
				if(((i+d)%7==0)||(i==days[month]))
				{
					System.out.println();
					System.out.println("-------------------------------------------------------");
				}
				
			}	
			System.out.println("=======================================================");
		}
        
	

}