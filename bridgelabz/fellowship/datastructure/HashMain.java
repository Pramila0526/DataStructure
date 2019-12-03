package com.bridgelabz.fellowship.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgelabz.fellowship.utility.HashingLinkedListUtility;
import com.bridgelabz.fellowship.utility.Utility;

public class HashMain {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("Enter the size");
		int size = Utility.integerInput();
		
		HashingLinkedListUtility hs = new HashingLinkedListUtility(size);
		
		File file = new File("/home/admin94/Desktop/DataStructure(FP)/DataStructurePrograms"
				             + "/hashing.txt");
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String storeToFile = "";
		String readFromFile;
		
		while ((readFromFile = br.readLine()) != null) {

			storeToFile = storeToFile + readFromFile;
		}
		
		//System.out.println(storeToFile);
	    // br.close();
		
		storeToFile = storeToFile.trim();
		String fileInput[] = storeToFile.split(",");
		
		for (String i : fileInput) 
		{
			int number = Integer.parseInt(i);
			hs.insert(number);
			System.out.println(i);
		}
		
		/*System.out.println("Enter the number of operations you want to perform");
		int n=Utility.integerInput();
		int value[]=new int[n];
		for(int i=0;i<=n;i++)
		{*/
		int ch;
		do
		{
			System.out.println("=====Operations=====");
			System.out.println();
			System.out.println("1.Search Operation");
			System.out.println("2.Again Search Operation");
			System.out.println("3. Write to File");
			System.out.println("4.Exit Operation");
			System.out.println();
			System.out.println("Enter your choice");
			ch=Utility.integerInput();
			
			switch(ch)
			{
			case 1:
			  System.out.println("Find the number to be searched");
			  int number= Utility.integerInput();
			  hs.search(number);
			  hs.display();
			  break;
			
			case 2:
				System.out.println("Again perform search");
				number= Utility.integerInput();
				hs.search(number);
				hs.display();
				break;
			case 3:	
		   hs.writeToFile();
		   break;
	
			case 4:
				System.exit(0);
				break;
				
			default:
					System.out.println("Wrong choice");
					break;
		
		}
			
	}while(ch>0);
	}
}
