package com.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class CreateEmployeeDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure()
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			//begin transaction
			session.beginTransaction();
			
			//Create Employee object
			System.out.println("Creating Object...");
			Employee myEmployee = new Employee("Willesen","Rock","Facebook");
			
			//Save object 
			System.out.println("Saving object....");
			session.save(myEmployee);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done...");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
