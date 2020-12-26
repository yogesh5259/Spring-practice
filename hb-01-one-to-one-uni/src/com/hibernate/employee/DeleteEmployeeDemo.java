package com.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class DeleteEmployeeDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			//begin transaction
			session.beginTransaction();

			// Read object using primary key

			//Employee myEmployee = session.get(Employee.class,2);

			//Delete object using primary key
			//session.delete(myEmployee);
			
			session.createQuery("delete from Employee where firstName = 'Yogesh'").executeUpdate();
			
			System.out.println("Object Deleted...");
			
			//commit transaction
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
