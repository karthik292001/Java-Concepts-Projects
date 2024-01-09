package com.kn.interface1;

public interface Student {//  for interface object can not be create
	
	int i=10;
//	int j;          In java interface variables are by default public static final
//	j=20;
	
	void study();//         interface methods are marked as public and abstract by default
	
	public abstract void doProject();
}
