package com.kn.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		System.out.println("Size before = "+list.size());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("*****Homogeneous data****");
		System.out.println(list);
		System.out.println("Size = "+list.size());
		
		System.out.println();
		System.out.println("****Heretogeneous data****");
		list.add(10);
		list.add(22.4);
		list.add('a');
		list.add("karthik");
		System.out.println(list);
		System.out.println("Size = "+list.size());
		
	}

}
