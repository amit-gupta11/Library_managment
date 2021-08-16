package managment.utils;

import java.util.Scanner;
import managment.services.ConnectionEstablishing;

public class InsertingStudentData {

    public static void insertData() {
        Scanner inputReader = null;
        try {
            inputReader = new Scanner(System.in);
            System.out.print("Enter ROLL NUMBER of Student: ");
            String rollNo = inputReader.nextLine();

            System.out.print("Enter Name of Student: ");
            String name = inputReader.nextLine();

            System.out.print("Enter E-mail of Student: ");
            String email = inputReader.nextLine();

            System.out.print("Enter class of Student: ");
            String studentClass = inputReader.nextLine();

            System.out.print("Enter Mobile Number of Student: ");
            String mobileNumber = inputReader.nextLine();

            String sql = "insert into student_details(roll_num, name, email, class_name, mobile_num) "
                    + "VALUES ('" + rollNo + "', '" + name + "', '" + email + "', '" + studentClass + "', '" + mobileNumber + "' );";
            ConnectionEstablishing.querryUpdate(sql, null);

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
