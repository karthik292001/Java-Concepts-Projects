package com.kn.generics;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class GenericsDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
//		q.add("hello"); //--> compile time error
		
		ArrayDeque<String> q1=new ArrayDeque<String>();
		q1.add("one");
		q1.add("two");
		q1.add("three");
//		q1.add(10); //--> only string data can be stored
		
	}

}
