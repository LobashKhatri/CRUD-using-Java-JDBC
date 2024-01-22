package com.management;

import java.util.Scanner;

public class Start {

	public static void main(String[] args){
		
		try (Scanner inScanner = new Scanner(System.in)) {
			boolean loop=true;
			
			while (loop) {
				//Printing the statements:
				System.out.println("Enter Your Choice:");
				System.out.println("1.Insert Data:");
				System.out.println("2.Delete Data:");
				System.out.println("3.Display Data:");
				System.out.println("4.Exit App:");
				
				//getting input for switch:
				int choice= inScanner.nextInt();
				//consuming new line in scanner:
				inScanner.nextLine();
							
				//Switch Statement for different operations:
				switch (choice) {
				case 1:
					System.out.println("Enter Name:");
					String employeeName= inScanner.nextLine();
					System.out.println("Enter Address:");
					String employeeAddress= inScanner.nextLine();
					System.out.println("Enter Salary:");
					Float employeeSalary= inScanner.nextFloat();
					//object of employee class to store the data
					Employee employeeObject= new Employee(employeeName, employeeAddress, employeeSalary);
					
					boolean answer=StudentDAO.insertStudent(employeeObject);
					if(answer) {
						System.out.println("succefully added");
					}else {
						System.out.println("something went wrong..");
					}
					
					System.out.println("Inserted....["+employeeName+", "+employeeAddress+", "+employeeSalary+", "+"]");
					break;
					
				case 2:
					System.out.println("Enter ID to delete record:");
					int id= inScanner.nextInt();
					Boolean fBoolean= StudentDAO.deleteStudent(id);
					if(fBoolean) {
						System.out.println("record deleted. ID:"+id);
					}else {
						System.out.println("something went wrong..");
					}
					break;
					
				case 3:
					System.out.println("All Records:");
					StudentDAO.displayRecord();
					break;
					
				case 4:
					System.out.println("Exiting");
					loop= false;
					break;

				default:
					System.out.println("Invalid Input!");
					break;
				}
			}
		}
		
		
		

	}

}
