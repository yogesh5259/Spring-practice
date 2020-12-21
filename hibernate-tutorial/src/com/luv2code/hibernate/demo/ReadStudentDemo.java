package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		//Create Session factory
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Student.class)
									 .buildSessionFactory();
		
		//Create a Session
		Session session = factory.getCurrentSession();
		
		
		try {			
			// create a student object
			System.out.println("Creating new student object...");
			Student thestudent = new Student("daffy","Duck","daffyduck@gmail.com");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the object...");
			System.out.println(thestudent);
			session.save(thestudent);
						
			//commit transaction
			session.getTransaction().commit();
			
			
			//find out the student's id :primary key
			System.out.println("Saved student. Generated id: " + thestudent.getId());
			
			//now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on primary key
			System.out.println("\nGetting student with id: " + thestudent.getId());
			
			Student myStudent = session.get(Student.class,thestudent.getId());
			 
			System.out.println("Get complete: " + myStudent);
			
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
		} finally {
			factory.close();
		}
		
	}
}
