package com.kn.PrimeNumber;

public class CheckPrimeNumber {
	public String checkPrimeNumber(int num) {
		int flag=0;
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				flag++;
			}
		}
		if(flag==1) {
			return num+" number is prime";
		}else {
			return num+" num is not prime";
		}
	}
}
