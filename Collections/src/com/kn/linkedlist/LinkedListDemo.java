package com.kn.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(8);
		list.add(2.3);
		list.add('c');
		list.add("kat");
		System.out.println("Data in linked list1 = "+list);
		
		list.add(2,2);
		System.out.println("Data in linked list1 after adding an element = "+list);
		
		list.set(4,'k');
		System.out.println("Data in linked list1 replacing data at specified index = "+list);
		
		System.out.println();
		LinkedList list2=new LinkedList();
		list2.addAll(list);
		System.out.println("Data in linked list2 = "+list2);
	
		
		
		
	}

}
