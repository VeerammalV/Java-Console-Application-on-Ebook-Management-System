package org.ebooks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewAllBooks extends BookDetails{
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ebookstore","root","2001");
			PreparedStatement ps = connection.prepareStatement("select * from bookdetails");
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter User Name: ");
//			String UserName = sc.nextLine();
//		//	ps.setString(1, UserName);
			ResultSet rs = ps.executeQuery();
			ArrayList<BookDetails> viewbook = new ArrayList<>();
			
			while(rs.next()) {
				BookDetails book = new BookDetails();
			//	Registration regis = new Registration();
				book.setBookId(rs.getString("BookId"));
				book.setBookName(rs.getString("BookName"));
				book.setAuthorName(rs.getString("AuthorName"));
				book.setPrice(rs.getLong("Price"));
				
				viewbook.add(book);
				
			}
			for (BookDetails details: viewbook) {
				System.out.print("Book Id: " + details.getBookId()+"\t\t");
				System.out.print("Book Name: "+ details.getBookName()+"\t\t");
				System.out.print("Author Name: "+ details.getAuthorName()+"\t\t");
				System.out.print("Price: "+ details.getPrice()+"\n");
				//System.out.println("Available Books");
			}
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
