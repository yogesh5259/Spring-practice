package com.luv2code.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateCourseAndStudentDemo {

	public static void main(String[] args) {

		// Create Session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// Create a Session
		Session session = factory.getCurrentSession();

		try {
			
			// start a transaction
			session.beginTransaction();

			//create a course
			Course tempCourse = new Course("Namaste JavaScript");
			
			//save the course 
			System.out.println("\nSaving the course!..");
			session.save(tempCourse);
			System.out.println("saved the course: " + tempCourse);
			
			
			//Create the student
			Student tempStudent1 = new Student("Mary","Doe","Mary@mail.com");
			Student tempStudent2 = new Student("Chad","Darby","chadDarby2luv2code.com");
	
			
			//Add the students to the course 
			tempCourse.addStudent(tempStudent1);
			tempCourse.addStudent(tempStudent2);
			
//			System.out.println("\nSaving the course!");
//			session.save(tempCourse);
//			System.out.println("\nSaved");

			//Save students
			System.out.println("\nSaving the students....");
			session.save(tempStudent1);
			session.save(tempStudent2);
			System.out.println("\nsaved students: " + tempCourse.getStudents());
			
			
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
