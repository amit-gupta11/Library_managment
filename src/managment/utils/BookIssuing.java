package managment.utils;

import java.text.SimpleDateFormat;
import java.util.*;
import managment.services.*;

public class BookIssuing {

    public static void issuingBook() {
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("ENTER ID OF BOOK AND ROLL NUMBER OF STUDENT FOR ISSUING BOOK");
        try {
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER BOOK ID:");
            String bookId = consoleInput.nextLine();
            System.out.println("ENTER ROLL NUMBER:");
            String rollNumber = consoleInput.nextLine();
            System.out.println("ENTER BOOK ISSUE DATE:");
            String issuedDate = consoleInput.nextLine();
            Date tempDate = formatter2.parse(issuedDate);
            Calendar calender = Calendar.getInstance();
            calender.setTime(tempDate);
            calender.add(Calendar.DATE, 15);
            Date returnDate = calender.getTime();
            String verify = "select count (id) from borrowed_books where student_roll_num = '" + rollNumber + "' ";
            int count = CountFromDatabase.countRecord(verify);
            System.out.println(verify);
            System.out.println(count);
            if (count < 5) {
                String sql = "insert into borrowed_books(book_id, student_roll_num, issued_date, return_date) "
                        + "VALUES ('" + bookId + "', '" + rollNumber + "', '" + issuedDate + "', '" + returnDate + "' );";

                ConnectionEstablishing.querryUpdate(sql, null);
            } else {
                System.err.println("YOU ISSUE MAXIMUM NUMBER OF BOOKS");
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }
}
