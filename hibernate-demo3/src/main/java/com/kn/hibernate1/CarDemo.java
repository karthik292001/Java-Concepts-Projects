package com.kn.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarDemo {

	public static void main(String[] args) {
		
		Car c1=new Car(101,"red","bajaj","XWZ",200);
		Car c2=new Car(102,"blue","audi","XWZ",300);
		Car c3=new Car(103,"white","jaguar","XWZ",400);
		
		Configuration con=new Configuration();
		con.configure();
		SessionFactory factory= con.buildSessionFactory();
		System.out.println("Connection successfully established = "+factory);
		
		Session session= factory.openSession();
		Transaction txt= session.beginTransaction();
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		System.out.println("Car has been added "+c1);
		System.out.println("Car has been added "+c2);
		System.out.println("Car has been added "+c3);
		
		txt.commit();
		
		
		
	}

}
