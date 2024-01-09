package com.kn.stringMethods;

public class StringContainsAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="raja ram mohan roy";
		boolean result=s.contains("raj");
		System.out.println("String conatins raj = "+result);
		
		String s1=s.replace("mohan", "rohan");
		System.out.println("String after replacing = "+s1);
	}

}
