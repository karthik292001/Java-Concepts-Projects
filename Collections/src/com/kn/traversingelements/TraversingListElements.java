package com.kn.traversingelements;

import java.util.ArrayList;
import java.util.ListIterator;

public class TraversingListElements {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(123);
		list.add(45);
		list.add(23);
		list.add(10);
		
		ListIterator itr=list.listIterator();
		
		System.out.println("Forward traversing using ListIterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Backward traversing using ListIterator");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
