package com.bridgelabz.fellowship.datastructure;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Arrays;

public class PracticeRW 
{
	public static void main(String[] args) throws IOException {
		
		File file = new File("/home/admin94/Desktop/DataStructure(FP)/DataStructurePrograms/Ordered.txt");
		byte[] bytes = new byte[(int) file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(bytes);
		fis.close();
		String[] valueStr = new String(bytes).trim().split("\\s+");
		int[] tall = new int[valueStr.length];
		for (int i = 0; i < valueStr.length; i++) 
		    tall[i] = Integer.parseInt(valueStr[i]);
		System.out.println(Arrays.asList(tall));
}
}