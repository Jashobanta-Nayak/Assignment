package org.capgemini.HibernateImage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) throws IOException {
		System.out.println( "Project started" );
		//connection established to the hibernate
		System.out.println("Hibernate getting connected!!!");
		Configuration cfg = new Configuration();
		cfg.configure("Address.cnf.xml");
		// Start the session factory to open the session for database connectivity
		SessionFactory factory= cfg.buildSessionFactory();
		// creating a Product object
		Address ad=new Address();
		//ad.setAddressId(1); --->not needed because we used generateValue
		ad.setStreet("Andara");
		ad.setCity("Balasore");
		ad.setOpen(true);
		ad.setX(55.7);
		ad.setAddDate(new Date());
		//Reading an image
		FileInputStream fis=new FileInputStream("src/main/java/balasorePic.jpg");
		// i need to check the image is available or not
		byte[] data=new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);

		// create another object to insert another data to database
		Address add=new Address();
		add.setStreet("Chandaka");
		add.setCity("Bhubaneswar");
		add.setOpen(true);
		add.setX(76.7);
		add.setAddDate(new Date());
		//Reading an image
		FileInputStream fis1=new FileInputStream("src/main/java/orissacenter.jpg");
		// i need to check the image is available or not
		byte[] data1=new byte[fis1.available()];
		fis1.read(data1);
		add.setImage(data1);

		//Set a connection to the database
		Session session= factory.openSession(); //Getting the data saved
		//start the transaction --->start the connection between database and javaApp 
		Transaction tx= session.beginTransaction();

		session.save(ad);
		session.save(add);
		tx.commit();
		//session.getTransaction().commit(); // Record saved to the database
		session.close();
		fis.close();
		fis1.close();
		System.out.println("Record saved succesfully itno the database!!!");
	}

}
