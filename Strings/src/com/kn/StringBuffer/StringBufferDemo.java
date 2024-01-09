package com.kn.StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer=new StringBuffer();
		System.out.println("Size= "+stringBuffer.length());
		System.out.println("Capacity= "+stringBuffer.capacity());
		
		System.out.println("******After appeding string******");
		stringBuffer.append("Java");
		System.out.println("Size= "+stringBuffer.length());
		System.out.println("Capacity= "+stringBuffer.capacity());

	}

}
