package com.bridgelabz.fellowship.utility;

public class StackBalancedWay2<T> {

	static int MAX = 10;
	static int top = -1;

	static char a[] = new char[MAX];

	public static<T> void push(char x)
	{
		if (top == MAX - 1)

			System.out.println("Stack full");

		else

			a[++top] = x;

	}

	char pop() {
		if (top == -1) {
			System.out.println("Underflow error");
			return 0;
		} else {
			char element = a[top];
			top--;
			return element;
		}

	}

	public static<T> void display() {

		if (top >= 0) {
			System.out.println("Elements are");
			for (int i = 0; i >= top; i--) {
				System.out.println(a[i] + "\t");
			}
		}
	}

	public boolean isEmpty() {
		return (top == -1) ? true : false;
	}

	
	static boolean check(char character1, char character2) 
	{
		if (character1 == '(' && character2 == ')')
			return true;
		
		else if (character1 == '{' && character2 == '}')
			return true;
		
		else if (character1 == '[' && character2 == ']')
			return true;
		
		else
			
			return false;
		
	}

	    @SuppressWarnings("static-access")
	public static boolean matchingPair(char a2[])
	{
		@SuppressWarnings("rawtypes")
		StackBalancedWay2 br = new StackBalancedWay2();

		for (int i = 0; i < a2.length; i++) 
		{
			if (a2[i] == '{' || a2[i] == '(' || a2[i] == '[')
				br.push(a2[i]);

			if (a2[i] == '}' || a2[i] == ')' || a2[i] == ']') 
			{
				if (br.isEmpty()) 
				{
					return false;
				} 
				else if (!check(br.pop(), a2[i]))
				{
					return false;
				}
			
			}
		}
		
		if (br.isEmpty()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
