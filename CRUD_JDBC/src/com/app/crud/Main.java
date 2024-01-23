package com.app.crud;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean loopOn= true;
		
		
		//Scanner object
		Scanner in= new Scanner(System.in);
		
		while (loopOn) {
			
			System.out.println("\n1.Insert Record.");
			System.out.println("2.Show All Records.");
			System.out.println("3.Show Record by ID.");
			System.out.println("4.Delete Record By ID.");
			System.out.println("5.Exit App.");
			System.out.println("Enter Choice-> ");
			
			
			int choice= in.nextInt();		//getting input for choice of operations
			
			in.nextLine();		//consuming next line;
			
			switch (choice) {
			//Inserting the records
			case 1:
				System.out.print("Enter Name: " );
				String name=in.nextLine();		//getting name input
				System.out.print("Enter Address: " );
				String address=in.nextLine();		//getting address input
				System.out.print("Enter Age: " );
				int age=in.nextInt();		//getting age input
				
				Student studentObj = new Student(name, address, age);	//passing the values to Student class
				DB_Dao.insertStudentRecord(studentObj);
				break;
				
			//Showing all records	
			case 2:
				DB_Dao.showRecords();
				break;
				
			//Show Record By ID	
			case 3:
				System.out.println("Enter ID: ");
				int id= in.nextInt();
				DB_Dao.showRecordByID(id);
				break;
				
			//Delete Record By ID	
			case 4:
				System.out.println("Enter ID to delete record:");
				int deleteID= in.nextInt();
				DB_Dao.deleteRecordByID(deleteID);
				break;
				
			//Exiting the App	
			case 5:
				System.out.println("Exited.");
				loopOn=false;
				break;

			//Default Statement	
			default:
				System.out.println("Invalid Input!!!!!!");
				break;
			}
			
			
		}
		
	}

}
