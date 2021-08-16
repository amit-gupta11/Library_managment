package managment.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetStudentRecord {

    public static int fetchRecord(String sql) {
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
            while (rs.next()) {
                System.out.print("ROLL NUMBER: " + rs.getInt("roll_num"));
                System.out.print(",STUDENT NAME: " + rs.getString("name"));
                System.out.print(",EMAIL: " + rs.getString("email"));
                System.out.println(",CLASS: " + rs.getString("class_name"));
                System.out.println(",MOBILE NUMBER: " + rs.getString("mobile_num"));
                System.out.println(",BOOK ID: " + rs.getInt("student_roll_num"));

            }
            statement.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return count;
    }
}
