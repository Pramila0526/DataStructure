package com.bridgelabz.fellowship.utility;

public class StackUtility<T>
{
	
	@SuppressWarnings("rawtypes")
	static Node top;

	@SuppressWarnings("rawtypes")
	static class Node<T> {
		T data;

		Node next;

		public Node(T data) {
			this.data = data;
			next = null;
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> void push(T data) {
		Node n = new Node(data);

		if (top == null) {
			top = n;
		} else {
			Node temp = top;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}

//this method is used for retrive data from the stack arr and remove the data from top of stack arr
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> T pop() {
		Node temp = top;
		Node prev = temp;
		T data = null;
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {

			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
			}

			if (prev == temp) {
				top = null;
			}
			data = (T) temp.data;
//System.out.println(data);
			prev.next = null;
		}
		return data;
	}

// this method check if stack arr is empty or not
	public static boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}

//this method return the item from top of stack without removing the item from stack arr
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> T peek() {
		Node temp = top;
		T data = null;
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {

			while (temp.next != null) {
				temp = temp.next;
			}

			data = (T) temp.data;
		}
		return data;
	}

// this method is return the size of the stack arr
	@SuppressWarnings({ "unchecked" })
	public static<T> int size() {
		int count = 0;
		Node<T> temp = top;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	@SuppressWarnings("unchecked")
	public static <T> void display() {
		
		Node<T> temp = top;
		@SuppressWarnings("unused")
		T data = null;
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {

			while (temp.next != null)
			{  
				System.out.print("|"+temp.data);
				temp = temp.next;
			}
			System.out.print("|"+temp.data+"|");
			 
		}
	
	}



}