package com.luv2code.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteInstructorDetailDemo {

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

			//get the instructor detail object
			int theId = 6;
			InstructorDetail tempinsDetail = session.get(InstructorDetail.class, theId);
			
			//print the instructor detail
			System.out.println("tempinstructorDetail: " + tempinsDetail);
			
			//print the instructor 
			System.out.println("The associated instructor: " + tempinsDetail.getInstructor());
			
			//remove the associated object reference
			//break bi-directional link
			
			tempinsDetail.getInstructor().setInstructorDetail(null);
			
			//now delete the instructor detail
			System.out.println("Deleting tempinsDetail: " + tempinsDetail);
			session.delete(tempinsDetail);
			
			
			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			//Handle connection leak issue.
			session.close();
			
			factory.close();
		} 

	}
}
