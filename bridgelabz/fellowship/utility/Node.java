package com.bridgelabz.fellowship.utility;

public class Node<T> {
	public Node<T> node;
	public T data;
	public T key;

	public Node<T> next;
	public Node(T data)
	{
		this.data=data;
		
	}
	public Node(T key,T data)
	{
		this.key=key;
		this.data=data;
	}

	
}
