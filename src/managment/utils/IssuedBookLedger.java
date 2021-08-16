package managment.utils;

import java.util.Scanner;
import managment.services.*;

public class IssuedBookLedger {

    public static void fetchLedger() {
        try {
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER ROLL NUMBER:");
            String rollNumber = consoleInput.nextLine();
            String sql = "select book_id,student_roll_num,issued_date,return_date from borrowed_books where student_roll_num = '" + rollNumber + "'";
            GetFromDatabase.getRecord(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);

        }
    }
}
