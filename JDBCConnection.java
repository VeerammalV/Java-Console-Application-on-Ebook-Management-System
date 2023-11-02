package org.ebooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) {
		try {
			// Class.forName("com.sql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","2001");
			Statement statement = connection.createStatement();
			statement.executeUpdate("create database EBookstore1");
			System.out.println("Database created successfully");
		}
		catch(Exception exception) {
			System.out.println("Exception handled");
		}
		
		}

}
