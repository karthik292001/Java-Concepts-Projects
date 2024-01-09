package com.kn.stringPrograms;

public class ReverseString {

	public static String reverseString(String inputString) {
//		Convert input string into array of characters
		char []ch=inputString.toCharArray();
//		Create stringBuffer object to append characters
		StringBuffer stringBuffer=new StringBuffer();
//		Append each character from character array
		for(int i=ch.length-1;i>=0;i--) {
			stringBuffer.append(ch[i]);
		}
//		Re-build string from StringBuffer
		String resultantString=new String(stringBuffer);
//		Return resultant string
		return resultantString;
		
	}

}
