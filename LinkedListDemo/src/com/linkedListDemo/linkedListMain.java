package com.linkedListDemo;

public class linkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkeddList list=new LinkeddList();
	    list.add(new Node(10));
	    list.add(new Node(20));
	    list.add(new Node(30));
	    list.add(new Node(40));
	    list.add(new Node(50));
	    
	  System.out.println("-----------------print linked list-----------");
	    list.print();
	    
	  System.out.println("----------get value at given index------------");
	  System.out.println(list.getValue(1));	
	  
	  System.out.println("-------------get the index of given value-----");
	  System.out.println(list.getIndex(80));
	  
	  System.out.println("after deleting the value of given index thelinkedlist is");
	  list.delete(2);
	  list.print();
	}

}
