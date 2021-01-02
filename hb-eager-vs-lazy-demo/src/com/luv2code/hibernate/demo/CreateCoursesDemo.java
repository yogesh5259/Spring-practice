package com.luv2code.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateCoursesDemo {

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
			
			
			//create some courses
			Course theCourse1 = new Course("Air Guitar - The ultimate guide!");
			Course theCourse2 = new Course("The pinball masterclass");

			
			//add courses to instructor
			instructor.add(theCourse1);
			instructor.add(theCourse2);
			
			//save the courses
			session.save(theCourse1);
			session.save(theCourse2);
			
			
			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//add clean up
			session.close();
			factory.close();
		} 

	}
}
