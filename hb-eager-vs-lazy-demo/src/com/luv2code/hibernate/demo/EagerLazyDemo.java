package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {

		// Create Session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		// Create a Session
		Session session = factory.getCurrentSession();

		try {
			
			// start a transaction
			session.beginTransaction();

			
			//get the instructor from db
			int theId = 1;
			Instructor instructor = session.get(Instructor.class,theId);
			
			System.out.println("luv2code : Instructor: " + instructor);
			
			//get course for the instructor
			System.out.println("luv2code : Courses : " + instructor.getCourses());
			
			
			// commit transaction
			session.getTransaction().commit();

			System.out.println("luv2code : Done!");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//add clean up
			session.close();
			factory.close();
		} 

	}
}
