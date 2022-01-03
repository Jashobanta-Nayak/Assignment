package org.assignment2.ProductHibernateWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
	System.out.println( "Project started" );
	//connection established to the hibernate
	Configuration cfg = new Configuration();
	cfg.configure("product.cnf.xml");
	SessionFactory factory= cfg.buildSessionFactory();
	// creating a Student object

	Product pd=new Product();
	
	Session session= factory.openSession(); //Getting the data saved
	Transaction tx= session.beginTransaction();
	pd.setProdId(1);
	pd.setProdName("Killer");
	pd.setProdPrice(3450);
	pd.setProdDesc("Men's Jeans company");
	session.save(pd);
	tx.commit();
	//session.getTransaction().commit(); // Record saved to the database
	session.close();	
	System.out.println("Record saved succesfully itno the database!!!");
	}
}
