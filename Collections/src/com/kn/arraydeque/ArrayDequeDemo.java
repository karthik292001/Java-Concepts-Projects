package com.kn.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque q=new ArrayDeque();
		q.add(10);
		q.add(20);
		q.add('a');
		q.add(30);
		System.out.println("ArrayDeque = "+q);
		q.addFirst(11);
		q.add(90);
		System.out.println("ArrayDeque after adding new elements at front and rear end = "+q);
	}

}
