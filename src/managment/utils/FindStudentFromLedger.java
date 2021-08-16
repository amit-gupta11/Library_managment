package managment.utils;

import java.util.Scanner;
import managment.services.*;

public class FindStudentFromLedger {

    public static void fetchData() {
        try {
            System.out.println("ENTER ROLL NUMBER FOR SEARCHING");
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER ROLL NUMBER:");
            String rollNumber = consoleInput.nextLine();
            String sql = "Select e1.roll_num , e2.student_roll_num ,e1.name, e1.email, e1.class_name, e1.mobile_num"
                    + " from student_details e1 join borrowed_books e2 ON (e1.roll_num = e2.student_roll_num) where (e1.roll_num='" + rollNumber + "')";
            GetStudentRecord.fetchRecord(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
