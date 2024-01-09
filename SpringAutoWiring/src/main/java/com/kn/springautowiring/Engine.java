package com.kn.springautowiring;

public class Engine {
	
	int eng_No;
	String eng_type;
	public Engine() {
		super();
	}
	public Engine(int eng_No, String eng_type) {
		super();
		this.eng_No = eng_No;
		this.eng_type = eng_type;
	}
	public int getEng_No() {
		return eng_No;
	}
	public void setEng_No(int eng_No) {
		this.eng_No = eng_No;
	}
	public String getEng_type() {
		return eng_type;
	}
	public void setEng_type(String eng_type) {
		this.eng_type = eng_type;
	}
	@Override
	public String toString() {
		return "Engine [eng_No=" + eng_No + ", eng_type=" + eng_type + "]";
	}
	
	
	
}
