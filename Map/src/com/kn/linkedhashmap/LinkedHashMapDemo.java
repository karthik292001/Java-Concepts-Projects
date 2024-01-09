package com.kn.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
//		TO maintain order of insertion linkedhashmap is recommended
		
		LinkedHashMap map=new LinkedHashMap();
		map.put('1',234);
		map.put("2",23.84);
		map.put(true,"java");
		map.put('l',false);
		map.put('4','t');
		System.out.println(map);
		
	}

}
