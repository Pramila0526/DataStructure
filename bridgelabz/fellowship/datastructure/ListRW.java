package com.bridgelabz.fellowship.datastructure;


import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ListRW 
{
	public static void main(String[] args) throws IOException 
	{
		@SuppressWarnings("resource")
		FileReader fr=new FileReader("/home/admin94/Desktop/DataStructure(FP)/DataStructurePrograms/Ordered.txt");    
        int i;  
       
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        while((i=fr.read())!=-1)   
        {
        System.out.print((char)i);  
        list.add(i);
        }
	
    System.out.println();
    System.out.println("Data in the Form of Array");
	@SuppressWarnings("unused")
	Integer[] data =  list.toArray(new Integer[list.size()]);
	 System.out.println(Arrays.asList(list.toArray()));
}
}