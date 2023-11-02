package org.ebooks;

import java.util.Scanner;

public class HomePage {
	public static void main(String[] args) {
		System.out.println("Welcome to EBook Store");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Registration");
		System.out.println("2. Login");
		System.out.println("3. View All Books");
		System.out.println("4. Search for a Book");
		System.out.println("5. Add to Cart");
		System.out.println("6. Purchase Book");
		System.out.println("7. Logout");

		int choice = 0;
	
		do {System.out.println("Enter your choice: ");
		
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Registration");
			Registration registration = new Registration();
			registration.main(args);
			break;
			
		case 2:
			System.out.println("Login");
			UserLogin userlogin = new UserLogin();
			userlogin.main(args);
			break;
			
		case 3:
			System.out.println("View All Books");
			ViewAllBooks viewAllBooks = new ViewAllBooks();
			viewAllBooks.main(args);
			break;
			
		
		case 4:
			System.out.println("Search for a Book");
			SearchBook searchbook = new SearchBook();
			searchbook.main(args);
			break;
			
		case 5:
			System.out.println("Add to Cart");
			AddToCart addtocart = new AddToCart();
			addtocart.main(args);
			break;
			
		case 6:
			System.out.println("Purchase Book");
			Purchase purchase = new Purchase();
			purchase.main(args);
			System.out.println("Happy Reading!");
			break; 	
			
		case 7:
			System.out.println("Logged out successful");
			break;
			
		default:
			System.out.println("Invalid input");
			
		}
		}while(choice!=7);	
	}
}
