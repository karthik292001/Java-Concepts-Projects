package com.kn.leapYear;

public class CheckLeapYear {
	public String checkLeapYear(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					return year+" is a Leap Year";
				}else {
					return year+" is not a Leap Year";
				}
				
			}else {
				return year+" is a Leap Year";
			}
			
		}else {
			return year+" is not a Leap Year";
		}
	}
}
