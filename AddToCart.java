package org.ebooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AddToCart extends AddBook{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Press enter to continue");
	String Book = sc.nextLine();
	System.out.println("Enter username: ");
	String UserName = sc.next();
	System.out.println("Enter book id: ");
	String bookid = sc.next();

	try 
	{
//	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ebookstore","root","2001");
	String sql = "insert into carting(BookId, BookName, AuthorName, Price, UserName) select B.BookId, B.BookName, B.AuthorName, B.Price, R.UserName from bookdetails B, registration R where B.BookId=? and R.UserName=?";

	
//	Statement statement = connection.createStatement();
//	String sql = "create table carting(BookId varchar(255),BookName varchar(255), AuthorName varchar(255), Price int(10), UserName varchar(255))";
//	statement.executeUpdate(sql);
	PreparedStatement ps = connection.prepareStatement(sql);
	
	ps.setString(2,UserName);
	ps.setString(1, bookid);
	ps.execute();

	
	
	ps.close();
	connection.close();
	System.out.println("Your product added to cart successfully");	
	
	}
	
	catch(Exception e) {
	e.printStackTrace();
	}
  }
}


