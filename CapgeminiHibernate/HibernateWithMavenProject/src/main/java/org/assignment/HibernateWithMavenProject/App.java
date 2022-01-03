package org.assignment.HibernateWithMavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		System.out.println( "Project started" );
		//connection established to the hibernate
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cnf.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		// creating a Student object

		Employee em=new Employee();
		em.setEmpId(103);
		em.setEmpName("madhu");
		em.setEmpPh(891543079L);
		em.setEmpDekNo("F401");
		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();

		session.save(em);
		tx.commit();
		//session.getTransaction().commit(); // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
	}

}
