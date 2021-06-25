package com.linkedListDemo;

public class LinkeddList {	
	Node n;
	//for add in linked list
	public void add(Node node)
	{
		if(n==null)
		{
			n=node;
		}
		else
		{
			Node n1=n;
			while(n1.next!=null)
			{
				n1=n1.next;
			}
			n1.next=node;
		}
	}
	// for printing the linked list
	public void print()
	{
		Node n1=n; 
		
		while(n1!=null)
		{
			System.out.println(n1.data+" ");
			n1=n1.next;
		}
		System.out.println();
	}
	//for getting value at given index
	public int getValue(int index)
	{
		int count=0;
		Node n1=n;
		while(n1!=null)
		{
			if(count==index)
			{
				return n1.data;
			}
			count++;
			n1=n1.next;
		}
		return 0;
	}
	//get the index of the given value
	public int getIndex(int d)
	{
		try {
		Node n1=n;
		int i=0;
		while(n!=null)
		{
			if(n1.data==d)
			{
				return i;
			}
			i++;
			n1=n1.next;
		}
		}catch(Exception e)
		{
			System.out.println("value not present in linked list");
		}
		return -1;
	}
	//for deleting the value from the linked list 
	public void delete(int index)
	{
		Node n1=n;
		int count=0;
		
		while(n1!=null)
		{
		   if(count+1==index)	
		   {
			   n1.next=n1.next.next;
			   break;
		   }
		   n1=n1.next;
		   count++;
		}
	}
}
