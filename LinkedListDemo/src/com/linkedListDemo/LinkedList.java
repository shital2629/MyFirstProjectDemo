package com.linkedListDemo;

public class LinkedList {
	
	public static class Node{
		
		String data;
		Node next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1=new Node();
		Node n2=new Node();
		Node n3=new Node();
		Node n4=new Node();
		
		n1.data="abc";
		n2.data="xyz";
		n3.data="lmn";
		n4.data="pqr";
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=null;
		
		for(int i=0;i<4;i++)
		{
			System.out.print(n1.data+" ");
			n1=n1.next;
		}
	}

}
