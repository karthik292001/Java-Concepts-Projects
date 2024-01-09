package com.kn.traversing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TraversingElementsDemo {

	public static void main(String[] args) {
		HashMap<Integer,Object> map=new HashMap();
		map.put(1,234);
		map.put(2,"java");
		map.put(3, 'k');
		map.put(4,3.4);
		map.put(5, true);
		
		
		System.out.println("==> Traversing only keys");
		Set keys=map.keySet();
		for(Object key:keys) {
			System.out.println(key);
		}
		
		System.out.println();
		System.out.println("==> Traversing only values");
		Collection values=map.values();
		for(Object value:values) {
			System.out.println(value);
		}
		
		System.out.println();
		System.out.println("==> Traversing both key-value pair");
		Set keyvalues=map.entrySet();
		for(Object keyvalue:keyvalues) {
			System.out.println(keyvalue);
		}
	}

}
