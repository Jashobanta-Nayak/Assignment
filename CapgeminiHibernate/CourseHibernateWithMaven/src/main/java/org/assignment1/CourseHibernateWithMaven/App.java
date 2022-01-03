package org.assignment1.CourseHibernateWithMaven;

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

		Course cr=new Course();
		cr.setCourseID(1);
		cr.setCourseName("JEE FULLSTACK");
		cr.setCoursePrice(32000);
		cr.setCourseDuration("6month");
		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();

		session.save(cr);
		tx.commit();
		//session.getTransaction().commit(); // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
	}

}
