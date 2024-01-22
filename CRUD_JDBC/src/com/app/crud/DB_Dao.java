package com.app.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB_Dao {
    public static void insertStudentRecord(Student studentRecord) {
        try (Connection con = DB_Connection.createConnection();
             PreparedStatement pstm = con.prepareStatement("INSERT INTO records (name, address, age) VALUES (?, ?, ?)")) {

            pstm.setString(1, studentRecord.getName());
            pstm.setString(2, studentRecord.getAddress());
            pstm.setInt(3, studentRecord.getAge());

            pstm.executeUpdate();
            System.out.println("Record inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace(); // Log or handle the exception appropriately in a real application.
        }
    }
}
