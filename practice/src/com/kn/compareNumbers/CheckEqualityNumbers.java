package com.kn.compareNumbers;

public class CheckEqualityNumbers {
		public void checkEqualityOfNumbers(int numbers[]) {
			int j=0;
			if(numbers[j]==numbers[j+1]) {
				if(numbers[j]==numbers[j+2]) {
					System.out.println("Given numbers are equal");
				}
			}
			else {
				System.out.println("Given numbers are not equal");
			}
			int greater=0;
			for(int i=0;i<numbers.length;i++) {
				if(numbers[i]>greater) {
					greater=numbers[i];
				}
			}
			System.out.println("Greater number among given numbers is: "+greater);
		}
}
