package org.ebooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Purchase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User name: ");
		String Book = sc.nextLine();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ebookstore","root","2001");
			String sql = "select BookID, BookName, AuthorName, Price, UserName from carting where UserName=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, Book);
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				String BookID = rs.getString("BookID");
				String BookName = rs.getString("BookName");
				String AuthorName = rs.getString("AuthorName");
				Long Price = rs.getLong("Price");
				String UserName = rs.getString("UserName");
				System.out.println("\t BookID:"+BookID+"\t BookName:"+BookName+"\t AuthorName:"+AuthorName+"\t Price:"+Price+"\t UserName:"+UserName);
				System.out.println("Proceed Payment");
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
