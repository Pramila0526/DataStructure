package com.bridgelabz.fellowship.utility;



public class QueueForBankingSimulationUtility 
{

	static Node head;
	static int size;

	
	public QueueForBankingSimulationUtility() {

		head = null;
		size = 0;
	}

	static class Node {
		int accountNumber;
		String userName;
		int balance;
		Node next;

		public Node(int accNo, String userName, int balance) {
			this.accountNumber = accNo;
			this.balance = balance;
			this.userName = userName;

			next = null;
		}

	}
	
	/*****To return the size*****/
	
	public int size()
	{

		return size;
	}
	
	/*****To add the User*****/
	
	public static void addUser(int accountNumber, String userName, int balance) {

		Node node = new Node(accountNumber, userName, balance);
		size++;
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		System.out.println( node.userName+"'s Account Added Auccsessfully!!!!");

	}

	/*****To show the List*****/
	
	public static void show() {

		Node temp = head;

		if (size == 0) {

			System.out.println("Empty");

		}
		while (temp.next != null) 
		{
			System.out.println("Account Number=" +temp.accountNumber + "\nUser Name=" + temp.userName + "\nBalance=" + temp.balance);

			temp = temp.next;
		}
		System.out.println();
		System.out.println("Account Number=" + temp.accountNumber + "\nUser Name=" + temp.userName + "\nBalance=" + temp.balance);

	}

	/*****To search the Account*****/
	
	public static void search(int acc) {

		if (head == null) {
			System.out.println("Empty");
		} else {
			if (acc == head.accountNumber) {
				transaction(acc);
			} else {
				Node temp = head;
				while (temp.next != null) {
					if (acc == temp.accountNumber) {
						transaction(acc);
					}

					temp = temp.next;
				}
				if (temp.accountNumber == acc) {
					transaction(acc);
				}
			}

		}

	}
	
	/****To Perform transactions*****/

	public static void transaction(int acc) {
		Node temp = head;
		int ch;
		int amount;
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Exit Transaction");
		System.out.println("Select Transaction Type");
		ch = Utility.integerInput();
		switch (ch) {
		case 1:
			if (temp.balance < 0) {
				System.out.println("Insufficient Balance in your Account");
			} else {
				System.out.println("Enter Amount to Withdraw");
				amount = Utility.integerInput();
				if (amount > temp.balance || amount <= 0) 
				{
					System.out.println("You have Entered Invalid amount or Your Balance is Insufficient");
				} else 
				{
					temp.balance = temp.balance - amount;
					System.out.println("Your balance is=" +temp.balance);
					System.out.println("Enter the Account Number  for operation");
					int accno = Utility.integerInput();
					QueueForBankingSimulationUtility.search(accno);
				
				}
			}
			break;
			
		case 2:
			System.out.println("Enter amount to deposit");
			amount = Utility.integerInput();
			if (amount > 0) {
				temp.balance = temp.balance + amount;
				System.out.println("Your current balance is" + temp.balance);
				System.out.println("Enter the Account Number  for  operation");
				int accno = Utility.integerInput();
				QueueForBankingSimulationUtility.search(accno);
			} 
			else
				System.out.println("Invalid amount");
			break;
			
		case 3:
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
		
	}

	
}
