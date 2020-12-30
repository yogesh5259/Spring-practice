package com.luv2code.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {

		// Create Session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();

		// Create a Session
		Session session = factory.getCurrentSession();

		try {
			
			
			// start a transaction
			session.beginTransaction();

			//get the instructor by primary key / id
			int theId = 3;
			Instructor theInstructor = session.get(Instructor.class,theId);
			
			
			System.out.println("found instructor:" + theInstructor);
			
			if (theInstructor != null) {
				System.out.println("Deleting " + theInstructor);
				session.delete(theInstructor);
			} 
			
			
			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		} 

	}
}
