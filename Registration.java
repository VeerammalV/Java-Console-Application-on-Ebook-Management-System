package org.ebooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Registration extends UserLogin{
	UserLogin login = new UserLogin();
	static Register register = new Register();
	
	public static void main(String[] args) {
		Scanner reg = new Scanner(System.in);
		
		System.out.println("First Name: ");
		String firstname = reg.next();
		register.setFirstName(firstname);
		
		System.out.println("Last Name: ");
		String lastname = reg.next();
		register.setFirstName(lastname);
		
		System.out.println("User Name: ");
		String username = reg.next();
		register.setFirstName(username);
		
		System.out.println("Password: ");
		String password = reg.next();
		register.setFirstName(password);
		
		System.out.println("Email ID: ");
		String emailid = reg.next();
		register.setEmailID(emailid);
		
		System.out.println("Phone Number: ");
		long phoneno = reg.nextLong();
		register.setPhoneNumber(phoneno); 
		
		try {
		//	Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ebookstore","root","2001");
		//	Statement statement = connection.createStatement();
		//	String sql = "create table registration(FirstName varchar(255),LastName varchar(255), Username varchar(255), Password varchar(255),EmailId varchar(255), PhoneNumber varchar(10))";
		//	statement.executeUpdate(sql);
			PreparedStatement ps = connection.prepareStatement("insert into registration values(?,?,?,?,?,?)");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, username);
			ps.setString(4, password);
			ps.setString(5, emailid);
			ps.setLong(6, phoneno);	
			ps.executeUpdate();
			System.out.println("Values inserted Successfully");	
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
			} 
		}
	}

