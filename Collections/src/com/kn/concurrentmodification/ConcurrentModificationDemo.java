package com.kn.concurrentmodification;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(12);
		list.add(29);
		list.add(10);
		list.add(34);
		int count=10;
		
//		Using traditional for loop - it won't throws exception (infinite loop)
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//			list.add(count);
//			count+=10;
//		}
		
		
		
//		for each loop - it throws an exception
		
//		for(Object value:list) {
//			System.out.println(value);
//			list.add(count);
//			count+=10;
//		}
		
		
//		iterator - it throws an exception
		
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			list.add(count);
//			count+=10;
//		}
		
		CopyOnWriteArrayList list1=new CopyOnWriteArrayList();
		list1.add(1);
		list1.add(3);
		list1.add(4);
		
		for(Object value:list1) {
			System.out.println(value);
			list1.add(count);
			count+=10;
		}
		System.out.println(list1);
		
	}

}
