package com.kn.sortingelements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;


public class Sorting2 {

	public static void main(String[] args) {
		
		TreeSet set=new TreeSet();
		set.add("Orange");
		set.add("Mango");
		set.add("Kiwi");
		set.add("Apple");
		set.add("Banana");
		System.out.println("Sorted set using TreeSet="+set);
		
		ArrayList list=new ArrayList();
		list.add("Orange");
		list.add("Mango");
		list.add("Kiwi");
		list.add("Apple");
		list.add("Banana");
		Collections.sort(list);
		System.out.println("Sorted list using Collections.sort()="+list);
	}

}
