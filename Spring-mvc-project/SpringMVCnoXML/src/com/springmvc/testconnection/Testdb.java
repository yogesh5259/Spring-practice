package com.springmvc.testconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testdb {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/online_user?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "password";
		
		
		try {
			System.out.println("Establishing connection....");
			Connection con = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection successful...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
