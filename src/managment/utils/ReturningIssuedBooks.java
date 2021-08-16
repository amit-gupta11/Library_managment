package managment.utils;

import java.util.Scanner;
import managment.services.ConnectionEstablishing;

public class ReturningIssuedBooks {

    public static void modifyingLedger() {
        try {
            System.out.println("ENTER ID OF BOOK AND STUDENT ROLL NUMBER FOR RETURNING BOOK");
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER BOOK ID:");
            String bookId = consoleInput.nextLine();
            System.out.println("ENTER ROLL NUMBER:");
            String studentId = consoleInput.nextLine();
            String sql = "delete from borrowed_books where book_id = '" + bookId + "' and student_roll_num = '" + studentId + "'";
            ConnectionEstablishing.querryUpdate(sql, null);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
