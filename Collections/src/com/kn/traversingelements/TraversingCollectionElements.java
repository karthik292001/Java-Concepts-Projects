package com.kn.traversingelements;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.*;

public class TraversingCollectionElements {

	public static void main(String[] args) {
		
//		Using for loop
		
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("---> Traversing arraylist elements using for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+" element="+list.get(i));
		}
		
//		Using for each or advanced for loop or enhanced for loop
		
		ArrayDeque q=new ArrayDeque();
		q.add(11);
		q.add(11.3);
		q.add('k');
		q.add("karthi");
		System.out.println("---> Traversing arraydeque elements using for each loop");
		int count=1;
		for(Object value :q) {
			System.out.println(count+" element="+value);
			count++;
		}
		
//		Using iterator interface
		
		ArrayDeque q1=new ArrayDeque();
		q1.add(123);
		q1.add("value");
		q1.add('v');
		q1.add(23.5);
		
		Iterator iterate=q1.iterator();
		
		System.out.println("--->Forward traversing arraydeque elements using Iterator");
		int count1=1;
		while(iterate.hasNext()) {
			System.out.println(count1+" element="+iterate.next());
			count1++;
		}
		
		System.out.println("--->Backward traversing arraydeque elements using Iterator");
		Iterator itr=q1.descendingIterator();
		int count2=q1.size();
		while(itr.hasNext()) {
			System.out.println(count2+" element="+itr.next());
			count2--;
		}
		

	}

}
