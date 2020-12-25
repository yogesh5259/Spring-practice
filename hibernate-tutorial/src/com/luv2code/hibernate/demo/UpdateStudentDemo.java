package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		//Create Session factory
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Student.class)
									 .buildSessionFactory();
		
		//Create a Session
		Session session = factory.getCurrentSession();
		
		
		try {			
			
			int studentId = 1;
			
			//now get a new session and start transaction
			session.beginTransaction();
			
			//retrieve student based on primary key
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class,studentId);
			 
			System.out.println("Updating student...");
			
			myStudent.setFirstName("scooby");
			
			// commit the transaction
			session.getTransaction().commit();
			
			// NEW CODE
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//Update student email for all
			System.out.println("Update Students email.... set 'foo@gmail.com'");
			
			session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		} finally {
			factory.close();
		}
		
	}
}
