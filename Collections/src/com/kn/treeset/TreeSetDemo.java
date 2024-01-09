package com.kn.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(40);
		set.add(23);
		set.add(1);
		set.add(34);
		System.out.println("Set in sorted order = "+set);
		
		TreeSet<String> set2=new TreeSet<String>();
		set2.add("Banana");
		set2.add("Apple");
		set2.add("Mango");
		set2.add("Grapes");
		set2.add("Grapes");
		System.out.println("Set in sorted order ="+set2);
	}

}
