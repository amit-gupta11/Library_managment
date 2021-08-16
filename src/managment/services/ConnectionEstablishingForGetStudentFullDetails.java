/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managment.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class ConnectionEstablishingForGetStudentFullDetails {

    public static int getStudentDataBaseRecord(String sql) {
        String url = "jdbc:postgresql://localhost:5432/library_managment";
        String user = "postgres";
        String password = "admin";
        Connection connection = null;
        Statement statement = null;
        int count = 0;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                System.out.print("ROLL NUMBER: " + rs.getInt("rollno"));
                System.out.print(",STUDENT NAME: " + rs.getString("name"));
                System.out.print(",EMAIL: " + rs.getString("email"));
                System.out.println(",CLASS: " + rs.getString("classname"));
                System.out.println(",MOBILE NUMBER: " + rs.getString("mobileno"));
                System.out.println(",BOOK ID: " + rs.getInt("studentid"));

            }
            statement.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return count;
    }
}
