package com.bridgelabz.fellowship.datastructure;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.fellowship.utility.Utility;

public class OrderedLLRW 
{
	public static void main(String args[]) 
	{
		OrderedList<Integer> ol=new OrderedList<Integer>();
		
		int[] arrayNumber = readNumbersConvertIntoArray("/home/admin94/Desktop/DataStructure(FP)/DataStructurePrograms/Ordered.txt");
     
		System.out.println("Emenents in an Array");
		System.out.println(Arrays.toString(arrayNumber));

		System.out.println("Enter the Number");
		int number=Utility.IntegerInput();
		for(int i=0;i<arrayNumber.length;i++)
		{
			
			if(number==arrayNumber[i])
			{
				ol.delete(arrayNumber[i]);
       		
			}
			else
			{
				 ol.insert(arrayNumber[i]);
      
			}
		}

		ol.display();

	}
	@SuppressWarnings("resource")
	public static int[] readNumbersConvertIntoArray(String file) {

		try {
			@SuppressWarnings("unused")
			File f = new File(file);
			Scanner s = new Scanner(new File(file));
			int count = 0;

			while (s.hasNextInt()) {

				count++;
				s.nextInt();
			}

			int[] arrayOfNumbers = new int[count];
			@SuppressWarnings("resource")
			Scanner s1 = new Scanner(new File(file));
			for (int i = 0; i < arrayOfNumbers.length; i++) 
			{
				arrayOfNumbers[i] = s1.nextInt();
			}
			return arrayOfNumbers;
		    } catch (FileNotFoundException e)
		{
			System.out.println("file not found");
		}

		return null;
	}
	

}
