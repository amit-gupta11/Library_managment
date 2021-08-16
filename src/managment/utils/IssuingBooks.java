/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managment.utils;

import java.text.SimpleDateFormat;
import java.util.*;
import managment.services.ConnectionEstablishingForCount;
import managment.services.ConnectionEstablishing;

/**
 *
 * @author Lenovo
 */
public class IssuingBooks {

    public static void bookIssue() {
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
            Calendar c = Calendar.getInstance();
            c.setTime(tempDate);
            c.add(Calendar.DATE, 15);
            Date returnDate = c.getTime();
            String verify = "SELECT COUNT (id) FROM BORROWBOOKS WHERE STUDENTID = '" + rollNumber + "' ";
            int count = ConnectionEstablishingForCount.countDataBaseRecord(verify);
            System.out.println(verify);
            System.out.println(count);
            if (count < 5) {
                String sql = "INSERT INTO BORROWBOOKS(bookid, studentid, borrowdate, returndate) "
                        + "VALUES ('" + bookId + "', '" + rollNumber + "', '" + issuedDate + "', '" + returnDate + "' );";

                ConnectionEstablishing.connectDataBase(sql, null);
            } else {
                System.out.println("HI");
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }
}
