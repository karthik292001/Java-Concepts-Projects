package com.kn.stringPrograms;

import java.util.Scanner;

public class CharArrayToString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		char ch[]=new char[scanner.nextInt()];
		System.out.println("Enter the data for character array elements:");
		for(int i=0;i<ch.length;i++) {
			ch[i]=scanner.next().charAt(0);
		}
		System.out.println("The resultant string after converting from array of character = "+characterArrayToString(ch));
		scanner.close();
		
	}
	public static String characterArrayToString(char []ch) {
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			stringBuffer.append(ch[i]);
		}
		String string=new String(stringBuffer);
		return string;
	}

}
