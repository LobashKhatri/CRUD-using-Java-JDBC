package com.management;

import java.sql.*;

public class CP {
	static Connection con;
	public static Connection createC() throws SQLException{
				
		try {
			//Load deriver
//			Class.forName("com.mysql.jdbc.Driver");
			
			//connection..
			String url="jdbc:mysql://localhost:3306/student_manage";
			String username="root";
			String password="100units";
			con= DriverManager.getConnection(url, username, password);
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
