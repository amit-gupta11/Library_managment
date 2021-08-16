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
public class CountFromDatabase {

    public static int countRecord(String sql) {
        String url = "jdbc:postgresql://localhost:5432/library_system";
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
            rs.next();
            count = rs.getInt(1);
            statement.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return count;
    }
}
