
package managment.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionEstablishing {

    public static void querryUpdate(String sql, String opertionType) {
        String url = "jdbc:postgresql://localhost:5432/library_system";
        String user = "postgres";
        String password = "admin";
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            int result = statement.executeUpdate(sql);
            if (result == 1) {
                System.out.println("COMMAND EXECUTED SUCCESSFULLY");
            } else if (opertionType != "DELETE") {
                System.out.println("BOOK RETURNED");
            } else {
                System.err.println("NO DATA PROCESSED");
            }
            statement.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }

}
