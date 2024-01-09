package com.kn.hibernate4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
	
		Bike b1=new Bike(101,"KTM",70000);
		Bike b2=new Bike(102,"Royal Enfield",100000);
		Bike b3=new Bike(103,"Hayabusa",90000);
		
		Student s1=new Student(01,"Amit",75,b3);
		Student s2=new Student(02,"Akash",63,b1);
		Student s3=new Student(03,"Ankit",81,b2);
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		System.out.println("Connection established successfully");
		
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(b1);
		session.save(b2);
		session.save(b3);
		
		txn.commit();
		
	}

}
