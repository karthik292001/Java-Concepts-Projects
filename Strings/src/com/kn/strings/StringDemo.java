package com.kn.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="karthik";
		System.out.println(s1);
		
		String s2=new String("karthi");
		System.out.println(s2);
		
		char []ch= {'k','a','a','r','i'};
		String s3=new String(ch);
		System.out.println(s3);
		
		//String constant pool
		String s4="karthik";
		String s5=new String("karthi");
	}

}
