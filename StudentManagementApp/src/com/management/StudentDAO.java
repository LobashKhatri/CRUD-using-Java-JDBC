package com.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;

public class StudentDAO {
	
	public static boolean insertStudent(Employee employee) {
		boolean f= false;
		try {
			Connection con= CP.createC();
			
			String query="insert into student(sname, saddress, salary) value (?,?,?)";
			//prepared statement
			PreparedStatement  pstm= con.prepareStatement(query);
			pstm.setString(1,employee.getEmployeeName());
			pstm.setString(2, employee.getEmployeeAddress());
			pstm.setFloat(3, employee.getEmployeeSalary());
		
			//execute
			pstm.execute();
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
		
		
		
	}

	public static boolean deleteStudent(int id) {
		boolean f= false;
		try {
			Connection con= CP.createC();
			
			String query="DELETE FROM student WHERE ID=?";
			//prepared statement
			PreparedStatement  pstm= con.prepareStatement(query);
			pstm.setLong(1, id);
			//execute
			pstm.execute();
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
	
	
	public static void displayRecord() {
		boolean f= false;
		try {
			Connection con=CP.createC();
			
			//query
			String query="Select * from student;";
			
			//statement
			Statement stm= con.createStatement();
			ResultSet dataResultSet= stm.executeQuery(query);
			
			while (dataResultSet.next()) {
				int id= dataResultSet.getInt(1);
				String name= dataResultSet.getString(2);
				String address= dataResultSet.getString(3);
				int salary= dataResultSet.getInt(4);
				
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Address: "+address);
				System.out.println("Salary: "+salary);
				System.out.println("++++++++++++++++++++++++");
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
