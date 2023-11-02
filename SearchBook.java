package org.ebooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchBook extends AddBook{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Search a book: ");
		String Book = sc.nextLine();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ebookstore","root","2001");
			String sql = "select BookID, BookName, AuthorName, Price from bookdetails where BookName=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, Book);
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				String BookID = rs.getString("BookID");
				String BookName = rs.getString("BookName");
				String AuthorName = rs.getString("AuthorName");
				Long Price = rs.getLong("Price");
				System.out.println("\t BookID:"+BookID+"\t BookName:"+BookName+"\t AuthorName:"+AuthorName+"\t Price:"+Price);
				
		/*		System.out.println("Book Id: "+BookID);
				System.out.println("Book Name: "+BookName);
				System.out.println("Author Name: "+AuthorName);
				System.out.println("Price: "+Price);		*/
			}
			rs.close();
			ps.close();
			connection.close();			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	  }
}
