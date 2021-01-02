package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class FetchJoinDemo {

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

			//option 2 " Hibernate Query with HQL
			
			Query<Instructor> query = session.createQuery("select i from Instructor i "
										+ "JOIN FETCH i.courses "
										+ "where i.id=:theInstructorId",Instructor.class );
			//set parameter on query
			query.setParameter("theInstructorId", theId);
			
			//execute query and get instructor
			Instructor tempinstructor = query.getSingleResult();
			
			
			System.out.println("luv2code : Instructor: " + tempinstructor);
			
			
			// commit transaction
			session.getTransaction().commit();
			
			
			//Close the session
			session.close();
			
			System.out.println("\nluv2code:- The session is now closed.\n");
			
			//option 1:- load while session is open using getter method
			//this should be fail
			//get course for the instructor
			System.out.println("luv2code : Courses : " + tempinstructor.getCourses());
			

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
