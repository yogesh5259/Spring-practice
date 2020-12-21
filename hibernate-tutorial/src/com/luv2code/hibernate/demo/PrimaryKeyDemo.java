package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {

		// Create Session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// Create a Session
		Session session = factory.getCurrentSession();

		try {
			// create 3 student objects
			System.out.println("Creating new student object...");
			Student student1 = new Student("Yogesh", "patel", "patelyogesh5040@gmail.com");
			Student student2 = new Student("paul", "Doe", "paul@gmail.com");
			Student student3 = new Student("mary", "public", "mary@gmail.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("Saving the object...");
			session.save(student1);
			session.save(student2);
			session.save(student3);


			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			factory.close();
		}

	}

}
