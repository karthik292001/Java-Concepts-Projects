package com.kn.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println("Priority queue ="+q);
		
		q.add(5);
		System.out.println("Priority queue after smallest element ="+q);
		
		q.add("karthik"); // ---> exception occurs because priority queue can store only homogeneous data
	}

}
