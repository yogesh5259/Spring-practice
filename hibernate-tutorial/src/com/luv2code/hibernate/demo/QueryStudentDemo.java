package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

@SuppressWarnings("unchecked")
public class QueryStudentDemo {

	public static void main(String[] args) {
		
		//Create Session factory
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Student.class)
									 .buildSessionFactory();
		
		//Create a Session
		Session session = factory.getCurrentSession();
		
		
		try {			
			
			//start a transaction
			session.beginTransaction();
			
			//query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			
			//display the students
			displayStudents(theStudents);
			
			//query students: lasName = 'Doe'
			theStudents = session.createQuery("from Student s where s.lastName = 'Doe'").getResultList();
				
			//display the students
			System.out.println("\n\nThe student who have last name is Doe");
			displayStudents(theStudents);

			//query students: lastName= 'Doe' Or firstName = 'Yogesh'
			theStudents = session.createQuery("from Student s where s.lastName='doe' OR s.firstName='Yogesh'").getResultList();
			
			//display the students
			System.out.println("\n\n The student who have firstName Yogesh and lastName Doe");
			displayStudents(theStudents);
			
			
			//query student where email LIKE '%luv2code.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
			
			//display the students
			System.out.println("\n\n The student who have email endswith gmail.com");
			displayStudents(theStudents);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		} finally {
			factory.close();
		}
		
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}
}
