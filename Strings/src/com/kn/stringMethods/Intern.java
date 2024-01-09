package com.kn.stringMethods;

public class Intern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("java");
		String str2=str1.intern();
		if(str1==str2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(str1.equals(str2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		String s3="java";
		if(str2==s3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(str2.equals(s3)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
