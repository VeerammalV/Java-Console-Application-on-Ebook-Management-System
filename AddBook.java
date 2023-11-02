package org.ebooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AddBook extends BookDetails{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Scanner id = new Scanner(System.in);
		System.out.println("Book Id: ");
		String bookid = id.next();
		
		Scanner book = new Scanner(System.in);
		System.out.println("Book Name: ");
		String bookname = book.next();
		
		Scanner author = new Scanner(System.in);
		System.out.println("Author Name: ");
		String authorname = author.next();
		
		System.out.println("Price:  ");
		long price = sc.nextLong();
		
		
		
		try {
			//	Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ebookstore","root","2001");
			//	Statement statement = connection.createStatement();
			//	String sql = "create table bookdetails(BookId varchar(255), BookName varchar(255), AuthorName varchar(255), Price varchar(9))";
			//	statement.executeUpdate(sql);
				PreparedStatement ps = connection.prepareStatement("insert into bookdetails values(?,?,?,?)");
				ps.setString(1, bookid);
				ps.setString(2, bookname);
				ps.setString(3, authorname);
				ps.setLong(4, price); 
				ps.executeUpdate();	
				System.out.println("Executed Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}
} 
