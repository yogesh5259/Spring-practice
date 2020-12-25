package com.luv2code.hibernate.demo;

import java.util.Date;

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
			
			Date bdate1 = DateUtils.parseDate("11/11/1996"); 
			Date bdate2 = DateUtils.parseDate("31/5/1997"); 
			Date bdate3 = DateUtils.parseDate("1/1/1990"); 
			
			// create 3 student objects
			System.out.println("Creating new student object...");
			Student student1 = new Student("Yogesh", "patel",bdate1, "patelyogesh5040@gmail.com");
			Student student2 = new Student("paul", "Doe",bdate2, "paul@gmail.com");
			Student student3 = new Student("mary", "public",bdate3, "mary@gmail.com");

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

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
