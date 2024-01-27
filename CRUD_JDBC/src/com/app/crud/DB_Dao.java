package com.app.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Dao {
    public static void insertStudentRecord(Student studentRecord) {
        try{
        	Connection con = DB_Connection.createConnection();
        	String query="INSERT INTO records (name, address, age) VALUES (?, ?, ?)";
             PreparedStatement pstm = con.prepareStatement(query);

            pstm.setString(1, studentRecord.getName());
            pstm.setString(2, studentRecord.getAddress());
            pstm.setInt(3, studentRecord.getAge());

            pstm.executeUpdate();
            System.out.println("Record inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately in a real application.
        }
        
    }//End of insertStudentRecord()
    
    public static void showRecords() {
    	try {
    		Connection con= DB_Connection.createConnection();
    		String query="Select * from records";
    		Statement stmt= con.createStatement();
    		ResultSet resultSet= stmt.executeQuery(query);
    		
    		while (resultSet.next()) {
    			int id= resultSet.getInt(1);
				String name=resultSet.getString(2);
				String address=resultSet.getString(3);
				int age=resultSet.getInt(4);
				
				System.out.println("");
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Address: "+address);
				System.out.println("Age: "+age);
				System.out.println("+++++++++++++++++++++++++++");
			}
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    }	// End of the showRecords()
    
    
    public static void showRecordByID(int getid) {
    	try {
    		Connection con= DB_Connection.createConnection();
    		String query="select * from records where id= ?";
    		PreparedStatement pstm= con.prepareStatement(query);
    		pstm.setInt(1, getid);
    		ResultSet resultSet= pstm.executeQuery();
    		
    		while (resultSet.next()) {
				int id= resultSet.getInt(1);
				String name= resultSet.getString(2);
				String address= resultSet.getString(3);
				int age= resultSet.getInt(4);
				System.out.println("\t["+id+", "+name+", "+address+", "+age+"]");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	 //End of the showRecordByID(int getid)
    
    
    public static void deleteRecordByID(int deleteID) {
    	try {
    		Connection con= DB_Connection.createConnection();
    		String query="delete from records where id= ?";
    		PreparedStatement pstm= con.prepareStatement(query);
    		pstm.setInt(1, deleteID);
    		pstm.execute();
   			System.out.println("Record Removed");    		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }	//End of the deleteRecordByID(int deleteID)
    
    
}
