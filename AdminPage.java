package org.ebooks;

import java.util.Scanner;

public class AdminPage {
	public static void main(String[] args) {
		System.out.println("Hello Admin!");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Admin Login");
		System.out.println("2. Add New Book");
		
		int choice = 0;
		
		do {System.out.println("Enter your choice: ");
		
		choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("Admin Login");
			Admin admin = new Admin();
			admin.main(args);
		break;
		
		case 2:
			System.out.println("Add New Book");
			AddBook addbook = new AddBook();
			addbook.main(args);
			break;
			
		
		default:
			System.out.println("Invalid input");
			
		}
		}while(choice!=7);	
	}	
		
}
