package org.assignment3.OrderHibernateWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		System.out.println( "Project started" );
		//connection established to the hibernate
		Configuration cfg = new Configuration();
		cfg.configure("order.cnf.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		// creating a Student object

		Order od=new Order();
		
		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();
		od.setOrderId(1);
		od.setOrderName("paint");
		od.setOrderDesc("Boys Casual Pants");
		session.save(od);
		tx.commit();
		//session.getTransaction().commit(); // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
	}

	}


