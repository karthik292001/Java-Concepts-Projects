package com.kn.deadlock;

public class Hospital {
	String resource1="Doctor";
	String resource2="Bed";
	
	public void tomTreatment() {
		try {
			synchronized (resource1) {
				System.out.println("Tom is using "+resource1);
				Thread.sleep(2000);
				synchronized (resource2) {
					System.out.println("Tom is using "+resource2);
					Thread.sleep(2000);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void jerryTreatment() {
		try {
			synchronized(resource2) {
				System.out.println("Jerry is using "+resource2);
				Thread.sleep(2000);
				synchronized (resource1) {
					System.out.println("Jerry is using "+resource1);
					Thread.sleep(2000);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
