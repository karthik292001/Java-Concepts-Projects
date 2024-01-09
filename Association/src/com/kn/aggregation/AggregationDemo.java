package com.kn.aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
			Pilot p1=new Pilot("karthik",800000.00);
			Airline a1=new Airline("Kingfisher",p1);
			
			a1.operation();
			a1=null;
			System.out.println("Airline is demolished");
			p1.fly();
			
	}

}
