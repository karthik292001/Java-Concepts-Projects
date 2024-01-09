package com.kn.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(23.4);
		list.add('a');
		list.add("karthik");
		list.add(true);
		System.out.println("List 1 elements = "+list);
		
		ArrayList list2=new ArrayList();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		System.out.println("List 2 elements = "+list2);
		
		System.out.println();
		list2.set(2,"four");
		System.out.println("List 2 elements after replacing element at specified index = "+list2);
		
		list2.addAll(list);
		System.out.println("List 2 elements after adding list 1 elements = "+list2);
	}

}
