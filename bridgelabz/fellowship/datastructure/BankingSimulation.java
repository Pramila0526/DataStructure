package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.Utility;
import com.bridgelabz.fellowship.utility.QueueForBankingSimulationUtility;

public class BankingSimulation 
{
	public static void main(String[] args)
	{

		System.out.println("Enter the number of users you want to register");
		int n = Utility.integerInput();
		if(n < 0) //if input is less than 0
		{
			System.out.println("Please Enter positive number");
			System.out.println("Enter account Number");
			n = Utility.integerInput();
		}
		int accNo;
		int balance;
		String Uname;
		for (int i = 1; i <= n; i++) 
		{
			System.out.println("Enter Account number ");
			accNo = Utility.integerInput();
			
			if (accNo < 0) //if input is less than 0
			{
				System.out.println("Please Enter possitive number");
				System.out.println("Enter the account Number");
				accNo = Utility.integerInput();
			}
			System.out.println("Enter User Name");
			Uname = Utility.stringInput();
			System.out.println("Enter Balance ");
			balance = Utility.integerInput();
			QueueForBankingSimulationUtility.addUser(accNo, Uname, balance);
		}
		
		QueueForBankingSimulationUtility.show();
		System.out.println();
		System.out.println("Enter the Account Number  for operation");
		int acc = Utility.integerInput();
		QueueForBankingSimulationUtility.search(acc);
	}

}
