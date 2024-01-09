package com.kn.wrapperclassess;

import java.util.ArrayList;

public class WrapperClassessDemo {

	public static void main(String[] args) {

//		Internal conversions

		ArrayList list=new ArrayList();
		list.add(10);				//list.add(new Integer(10));
		list.add(12.3);				//list.add(new Double(12.3));
		list.add('k');				//list.add(new Character('k));
		list.add(true);				//list.add(new Boolean(true));
		list.add("string");        //list.add(new String("string"));
		System.out.println(list);
		System.out.println(list.get(0));
		
//		Boxing 
		
		int i=50;
		Integer j=i;
		System.out.println(j);
		
//		UnBoxing
		
		int k=j;
		System.out.println(k);
		

	}

}
