package com.kn.daemonthreads;

public class DaemonThreads {

	public static void main(String[] args) {
		Typing t1=new Typing();
		Compilation t2=new Compilation();
		Saving t3=new Saving();
		t1.start();  // -->primary Thread
		
			t2.setDaemon(true); //-->Daemon Thread(Should execute atleast once after primary thread at the end)
			t3.setDaemon(true);//-->Daemon Thread
			
		t2.start();
		t3.start();
	}

}
