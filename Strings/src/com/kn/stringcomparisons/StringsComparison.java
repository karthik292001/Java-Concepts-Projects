package com.kn.stringcomparisons;

public class StringsComparison {

	public static void main(String[] args) {
		String s1="ram";
		String s2="ram";
		String s3=new String("ram");
		 
		System.out.println("****References comparisond****");
		if(s1==s2) {
			System.out.println("References are pointing to same object");
		}else {
			System.out.println("References are pointing to different objects");
		}
		if(s1==s3) {
			System.out.println("References are pointing to same object");
		}else {
			System.out.println("References are pointing to different objects");
		}
		System.out.println();
		
		
		System.out.println("****Data comparison****");
		if(s1.equals(s2)) {
			System.out.println("Same data");
		}else {
			System.out.println("Different data");
		}
	}

}
