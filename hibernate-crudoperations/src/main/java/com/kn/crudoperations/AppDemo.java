package com.kn.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppDemo {

	public static void main(String[] args) {
		
//		createLaptop();
//		readLaptop();
//		updateLaptop();
		deleteLaptop();
		
		
	}


	public static void createLaptop() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory factory= conf.buildSessionFactory();
		Session session= factory.openSession();
		Transaction txnt= session.beginTransaction();
		
		Laptop l1=new Laptop("Ideapad S145","Lenovo", 50000.0);
		
		session.save(l1);
		System.out.println(l1+" laptop has been persisted successfullly!");
		
		txnt.commit();
	}
	public static void readLaptop() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory factory= conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tnxt=session.beginTransaction();
		
		Laptop laptop=session.get(Laptop.class,"Dell-inspiron");
		System.out.println("Laptop specification has been fetched successfully = "+laptop);
		
		tnxt.commit();

		
	}
	

	public static void updateLaptop() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory factory= conf.buildSessionFactory();
		Session session= factory.openSession();
		Transaction tnxt=session.beginTransaction();
		
		Laptop laptop= session.get(Laptop.class,"Dell-inspiron");
			
			laptop.setManufacturer("Dell intel");
			laptop.setcost(80000);
			
		System.out.println("Laptop has been updated successfully = "+laptop);
		
		tnxt.commit();
	}

	public static void deleteLaptop() {
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory factory= conf.buildSessionFactory();
		Session session= factory.openSession();
		Transaction tnxt= session.beginTransaction();
		
		
		Laptop laptop= session.get(Laptop.class,"Dell-inspiron");
		
		session.delete(laptop);
		
		System.out.println("Laptop deleted successfully!");
		
		tnxt.commit();
		
	}



}
