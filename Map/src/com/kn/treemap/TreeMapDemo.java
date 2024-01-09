package com.kn.treemap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap  map1=new TreeMap();
		map1.put(1, "java");
		map1.put(2, "apple");
		map1.put(3, "banana");
		map1.put(3,"kiwi");
		map1.put(4, 2.4);
		map1.put(5,300);
		map1.put(6, 'k');
		map1.put(7,true);
		System.out.println(map1);
		
		
		TreeMap<Integer, Object> map2=new TreeMap<Integer, Object>();
		map2.put(3,"kiwi");
		map2.put(4, 2.4);
		map2.put(5,300);
		map2.put(6, 'k');
		map2.put(7,true);
//		map2.put(1.4,true);         // only key of integer type is allowed
		System.out.println(map2);
		
	}
	
	
	

}
