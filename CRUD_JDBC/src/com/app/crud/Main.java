package com.app.crud;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean loopOn= true;
		
		
		//Scanner object
		Scanner in= new Scanner(System.in);
		
		while (loopOn) {
			
			System.out.println("1.Insert Record.");
			System.out.println("2.Show All Records.");
			System.out.println("3.Show Record by ID.");
			System.out.println("4.Delete Record By ID.");
			System.out.println("5.Exit App.");
			System.out.println("Enter Choice-> ");
			
			
			int choice= in.nextInt();		//getting input for choice of operations
			//consuming next line;
			in.nextLine();
			switch (choice) {
			case 1:
				System.out.print("Enter Name: " );
				String name=in.nextLine();		//getting name inupt
				System.out.print("Enter Address: " );
				String address=in.nextLine();		//getting address input
				System.out.print("Enter Age: " );
				int age=in.nextInt();		//getting age input
				
				Student studentObj = new Student(name, address, age);
				DB_Dao.insertStudentRecord(studentObj);
				
				
				
				
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				System.out.println("Exited.");
				loopOn=false;
				break;

			default:
				System.out.println("Invalid Input!!!!!!");
				break;
			}
			
			
		}
		
		
		
	}

}
