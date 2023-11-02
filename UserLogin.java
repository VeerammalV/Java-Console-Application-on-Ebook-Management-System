package org.ebooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/EBookstore","root","2001");
			String sql = "SELECT * FROM registration WHERE username = ? AND Password = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the UserName: ");
			String UserName = scanner.next();
			
			System.out.println("Enter the Password:");
			String Password = scanner.next();
			
			preparedStatement.setString(1, UserName);
			preparedStatement.setString(2, Password);
			
			ResultSet resultset = preparedStatement.executeQuery();
			
			if(resultset.next()) {
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Login Failed");
				System.out.println("Please check your username and password.");
			}
			resultset.close();
			preparedStatement.close();
			connection.close();
			
		}catch(Exception exception) {
			exception.printStackTrace();			
		}
	}
}
