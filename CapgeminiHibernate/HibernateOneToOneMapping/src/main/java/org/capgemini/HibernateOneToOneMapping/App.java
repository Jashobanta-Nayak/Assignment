package org.capgemini.HibernateOneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		System.out.println("Project started!!!!");
		// configure the connectivity
		Configuration conf=new Configuration();
		conf.configure("hibernate.cnf.xml");
		// i need to establish the session
		SessionFactory factory=conf.buildSessionFactory();
		// creating questions object
		Question question=new Question();
		question.setQuestionId(1212);
		question.setQuestionName("What is java");

		// creating answer object
		Answer answer=new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("Java is a programming language");
		question.setAnswer(answer);
		/*second question*/
		// creating questions object
		Question question1=new Question();
		question1.setQuestionId(1213);
		question1.setQuestionName("What is Hibernate Framework?");

		// creating answer object
		Answer answer1=new Answer();
		answer1.setAnswerId(344);
		answer1.setAnswer("It is ORM tool which connects java object to database");
		question1.setAnswer(answer1);
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(answer);
		session.save(answer1);
		session.save(question);
		session.save(question1);
		tx.commit();
		
		//Fetching the data //get() & load()
		Question newQ=(Question) session.get(Question.class , 1);
		System.out.println(newQ.getQuestionName());
		System.out.println(newQ.getAnswer().getAnswer());
		
		Question Q=(Question) session.get(Question.class , 2);
		System.out.println(Q.getQuestionName());
		System.out.println(Q.getAnswer().getAnswer());
		
		session.close();
		factory.close();
		System.out.println("Record saved into database successfully!!!");

	}

}
