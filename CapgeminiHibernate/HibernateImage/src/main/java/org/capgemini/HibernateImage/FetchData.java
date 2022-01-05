package org.capgemini.HibernateImage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		// get() & load()
		Configuration cfg = new Configuration();
		cfg.configure("Address.cnf.xml");
		// Start the session factory to open the session for database connectivity
		SessionFactory factory= cfg.buildSessionFactory();
		Session session=factory.openSession();
		// Get Employee
		Address ad=(Address)session.get(Address.class, 1);
		System.out.println(ad.getAddressId());
		
		
		factory.close();
		session.close();
		
	}

}
