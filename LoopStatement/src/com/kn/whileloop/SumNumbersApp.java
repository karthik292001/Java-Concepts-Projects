package com.kn.whileloop;

public class SumNumbersApp {
	public void sumNumbers(int num) {
		int temp=num;
		int sum=0;
		while(num>=1) {
			sum +=num;
			--num;
		}
		System.out.println("sum of "+temp+" natural numbers is: "+sum);
	}
}
