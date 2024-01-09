package com.kn.stringcomparisons;

public class StringComparisonDemo3 {

	public static void main(String[] args) {
		String s1="ram";
		String s2="sita";
		String s3="ram"+"sita";
		String s4="ram"+"sita";
		
		System.out.println("**Reference comparison**");
		if(s3==s4) {
			System.out.println("Same references");
		}else {
			System.out.println("Different references");
		}
		
		System.out.println("**Data comparison**");
		if(s3.equals(s4)) {
			System.out.println("Same data");
		}else {
			System.out.println("Different data");
		}
	}

}
