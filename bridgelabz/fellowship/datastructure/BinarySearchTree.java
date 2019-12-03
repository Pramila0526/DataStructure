package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowship.utility.Utility;

public class BinarySearchTree<T extends Comparable<T>> {

	 Node<T> root;

	@SuppressWarnings("hiding")
	public class Node<T> {
		public T data;
		Node<T> left;
		Node<T> right;
		@SuppressWarnings("rawtypes")
		public Node next;

		public Node(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	Node<T> insertAt(Node<T> root, T data) {
		if (root == null) {
			root = new Node<T>(data);
		}
		if (data.compareTo((T) root.data) > 0) {
			root.right = insertAt(root.right, data);
		} else {
			root.left = insertAt(root.left, data);
		}
		//return root;
		return root;

	}

	public void insert(T i)
	{
		root = insertAt(root, i);
		
	}
	
	Node<T> inorder(Node<T> root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
		return root;
		
	}
	public void order(Node<T> root)
	{
		root=inorder(root);
	}
	

	public static int possibleNodes(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		int n1,n2;
		int result=0;
		for(int i=1;i<=n;i++)
		{
			n1=possibleNodes(i-1);
			n2=possibleNodes(n-i);
			result +=n1*n2;
		}
		return result;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		BinarySearchTree<?> tree=new BinarySearchTree();
		System.out.println("Enter the Number of Nodes");
		int n=Utility.integerInput();
		System.out.println("Possible Number of Nodes are");
		System.out.println(possibleNodes(n)); 
		
	}

	
}
