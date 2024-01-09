package com.kn.sortingelements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class SortingTechniques {

	public static void main(String[] args) {

//		Using TreeSet 
		
		TreeSet set=new TreeSet();
		set.add(45);
		set.add(12);
		set.add(22);
		set.add(9);
		set.add(2);
		System.out.println("Set Elements="+set);
		
//		Using Collections.sort()
		
		ArrayList list=new ArrayList();
		list.add(99);
		list.add(1);
		list.add(3);
		list.add(9);
		list.add(24);
		System.out.println("ArrayList elements before sorting="+list);
		Collections.sort(list);
		System.out.println("ArrayList elements after sorting+"+list);
	}

}
