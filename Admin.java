package org.ebooks;

import java.util.Scanner;

public class Admin {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Username:");
			String username = sc.next();
			
			System.out.println("Enter password");
			String password = sc.next();
			
			if("Veerammal".equals (username)&&"poorani".equals(password)) {
				System.out.println("Admin Login successful");
			}
			else {
				System.out.println("Check username and password");
			}}	
			catch(Exception e) {
				e.printStackTrace();
	}
}
}	


