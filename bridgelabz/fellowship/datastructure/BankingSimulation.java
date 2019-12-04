package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.Utility;
import com.bridgelabz.fellowship.utility.QueueForBankingSimulationUtility;

public class BankingSimulation 
{
	public static void main(String[] args)
	{

		System.out.println("Enter the number of users you want to register");
		int numberOfUsers=Utility.integerInput();
	    if(numberOfUsers < 0) //if input is less than 0
		{
			System.out.println("Please Enter positive number");
			System.out.println("\nEnter the number of users you want to register");
			numberOfUsers= Utility.integerInput();
		}
		
		
		for (int i = 1; i <= numberOfUsers; i++) 
		{
			System.out.println("Enter the Account number ");
			int accNo = Utility.integerInput();
			
			if (accNo < 0) //if input is less than 0
			{
				System.out.println("Please Enter possitive number");
				System.out.println("Enter the Account Number");
				 accNo = Utility.integerInput();
			}
			System.out.println("Enter User Name");
			String userName = Utility.stringInput();
			System.out.println("Enter Balance ");
			int balance = Utility.integerInput();
			QueueForBankingSimulationUtility.addUser(accNo, userName, balance);
		}
		
		QueueForBankingSimulationUtility.show();
		System.out.println();
		System.out.println("\nEnter the Account Number  for operation");
		int account = Utility.integerInput();
		QueueForBankingSimulationUtility.search(account);
	}
	}

