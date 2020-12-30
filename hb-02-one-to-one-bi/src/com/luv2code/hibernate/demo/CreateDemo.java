package com.luv2code.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateDemo {

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
			
//			//Create the object
//			Instructor tempInstructor = new Instructor("Yogesh", "Patel", "Yogesh@gmail.com");
//			
//			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com", "Love to code");
//			
//			//Associate the object
//			tempInstructor.setInstructorDetail(tempInstructorDetail);
//			
			Instructor tempInstructor = new Instructor("Chad", "darby", "chaddarby@luv2code.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.luv2code.com/youtube", "Love to code!!!");
			tempInstructor.setInstructorDetail(tempInstructorDetail);

			
			// start a transaction
			session.beginTransaction();

			// save the instructor
			// This is also save details object
			//because of CascadeType.ALL
			System.out.println("Saving the instructor "+ tempInstructor);
			session.save(tempInstructor);
			
			
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
