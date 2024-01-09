package com.kn.springautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class University {
	
	@Autowired
	@Qualifier("pr1")
	Professor pr;
	
	

	public University() {
		super();
	}
	
	public University(Professor pr) {
		super();
		this.pr = pr;
	}
	
	public Professor getPr() {
		return pr;
	}
	
	public void setPr(Professor pr) {
		this.pr = pr;
	}

	@Override
	public String toString() {
		return "University [pr=" + pr + "]";
	}

	
}
