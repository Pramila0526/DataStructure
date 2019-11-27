package com.bridgelabz.fellowship.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class UnOrderedFileRW 
{
	public static void main(String[] args) throws IOException 
	{
		File filePath = new File("/home/admin94/Desktop/DataStructure(FP)/DataStructurePrograms/UnOrdered.txt");
		UnOrderedList u=new UnOrderedList();
		
		/****Reading****/
		
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String fromFile = "";
		ArrayList<String> list = new ArrayList<String>();
		while ((fromFile = br.readLine()) != null) 
		{
			System.out.println("Data From File");
			System.out.println(fromFile);
			list.add(fromFile);
		}
		System.out.println();
        System.out.println("Data in the Form of Array");
		String[] data = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(list.toArray()));
		

		/***Writing****/
		
		try(FileWriter fileWriter = new FileWriter(filePath))
		{
		    String fileContent =list+"Pramila";
		    fileWriter.write(fileContent);
		 } 
		catch (IOException e)
		{
		    // exception handling
		}
		
		
		
	}
}
