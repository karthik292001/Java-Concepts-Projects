package com.kn.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(1);
		set.add(24);
		set.add(12);
		set.add(67);
		set.add(45);
		set.add(2);
		System.out.println(set);
	}

}
