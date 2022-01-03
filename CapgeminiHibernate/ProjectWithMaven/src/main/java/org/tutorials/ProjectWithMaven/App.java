package org.tutorials.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		System.out.println( "Project started" );
		//connection established to the hibernate
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		// creating a Student object

		Student st=new Student();
		st.setId(106);
		st.setName("Jasho");
		st.setCity("Odisha");

		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();

		session.save(st);
		session.getTransaction().commit(); // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
		//System.out.println(factory);
		//System.out.println(factory.isClosed());
		//System.out.println(factory.isOpen());
		// System.out.println(factory.equals(cfg));
		// System.out.println(factory.getSessionFactory());
	}

}
