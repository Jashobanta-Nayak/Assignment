package org.capgemini.HibernateManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		System.out.println("project get started!!!");
		//configure the xmlHibernate
		Configuration conf=new Configuration();
		// map the xml configuration file
		conf.configure("hibernate.cnf.xml");
		
		//start sessionFactory
		SessionFactory factory=conf.buildSessionFactory();
		
		//code implementation for emp class
		emp emp_one=new emp();
		emp emp_two=new emp();
		
		emp_one.setEid(34);
		emp_one.setName("Ram");
		 
		emp_two.setEid(35);
		emp_two.setName("Shyam");
		
		//code implementation for project class
		Project pro_one=new Project();
		Project pro_two=new Project();
		
		pro_one.setpId(14214);
		pro_one.setProjectName("Library Management");
		
		pro_two.setpId(12121);
		pro_two.setProjectName("Ecomerce Website");
		
		// we need to collect emp and project information
		List<emp> list_emp=new ArrayList<emp>();
		List<Project> list_project=new ArrayList<Project>();
        // adding the information to emp list
		list_emp.add(emp_one);
		list_emp.add(emp_two);
		
		// adding the information to project list
		list_project.add(pro_one);
		list_project.add(pro_two);
		
		//i need to map many to many mechanism
		emp_one.setProject(list_project);
		pro_two.setEmp(list_emp);
		
		// session
		Session session=factory.openSession();
		
		// transaction
		Transaction trans=session.beginTransaction();
		//save the data
		session.save(emp_one);
		session.save(emp_two);
		session.save(pro_one);
		session.save(pro_two);
		
		
		trans.commit();
		session.close();
		factory.close();
		
		
	}

}
