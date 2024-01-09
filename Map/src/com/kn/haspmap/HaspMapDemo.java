package com.kn.haspmap;

import java.util.HashMap;

public class HaspMapDemo {

	public static void main(String[] args) {
		
//		It supports both key and value of any type
		
		HashMap map=new HashMap();
		map.put('h',234);
		map.put(7.8,"mango");
		map.put("key",234);
		map.put(9,true);
		System.out.println(map);
		
	}

}
