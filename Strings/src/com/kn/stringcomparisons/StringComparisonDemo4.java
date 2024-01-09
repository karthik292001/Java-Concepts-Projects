package com.kn.stringcomparisons;

public class StringComparisonDemo4 {

	public static void main(String[] args) {
		String s1="ram";
		String s2="sita";
		String s3=s1+s2;
		String s4=s1+s2;
		
		System.out.println("**Reference comparison**");
		if(s3==s4) {
			System.out.println("Same references");
		}else {
			System.out.println("Different references");
		}
		
		System.out.println("**Data comparison");
		if(s3.equals(s4)) {
			System.out.println("Same data");
		}else {
			System.out.println("Different data");
		}
	}

}
