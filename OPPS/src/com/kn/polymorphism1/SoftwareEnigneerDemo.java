package com.kn.polymorphism1;

public class SoftwareEnigneerDemo {

	public static void main(String[] args) {
		SoftwareEngineer se=new SoftwareEngineer();
		doActivity(se);
		System.out.println("******");
		System.out.println();
		
		se=new BackendEngineer();
		doActivity(se);
		System.out.println("******");
		System.out.println();
		
		se=new JavaBackendEngineer();
		doActivity(se);
		System.out.println("******");
		System.out.println();
		
		se=new PythonBackendEnginerr();
		doActivity(se);
		System.out.println("******");
		System.out.println();
		
		se=new DatabaseEngineer();
		doActivity(se);
		System.out.println("******");
		System.out.println();
	}
	public static void doActivity(SoftwareEngineer se) {
		se.writeCode();
		se.attendMeeting();
		if(se instanceof JavaBackendEngineer) {
			((BackendEngineer) se).doProject();
			((JavaBackendEngineer)se).learnJava();
		}
		else if(se instanceof PythonBackendEnginerr) {
			((PythonBackendEnginerr)se).learnPython();
			((PythonBackendEnginerr) se).doProject();
		}else if(se instanceof BackendEngineer) {
			 
			((BackendEngineer) se).doProject();
		}
		else if(se instanceof DatabaseEngineer) {
			((DatabaseEngineer) se).doProject();
			((DatabaseEngineer) se).learnSql();
		}
		
	}

}
