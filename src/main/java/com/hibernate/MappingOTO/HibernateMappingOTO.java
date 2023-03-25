package com.hibernate.MappingOTO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.D2.Employee;

public class HibernateMappingOTO {

	public static void main(String[] args) {


		Books books = new Books();
		
		books.setbName("ReactJS");
		books.setbPrice(500.00);
		
		
		Student student = new Student();
		
		student.setsId(1);
		student.setsName("Anna");
		student.setsDep("IT");
		
		student.setBooks(books); //?
		
		
		
		Configuration config= new Configuration();  
		config.configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Books.class); // as parameter | java object 
		SessionFactory sessionFactory= config.buildSessionFactory(); 
		Session session=sessionFactory.openSession(); 
		Transaction transaction=session.beginTransaction();
		
		
		session.save(books);
		session.save(student);
		
		transaction.commit();
		session.close();
		 
	}

}
