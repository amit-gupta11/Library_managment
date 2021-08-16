/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managment.utils;

import java.util.Scanner;
import managment.services.ConnectionEstablishing;

/**
 *
 * @author Lenovo
 */
public class BookReturn {

    public static void returningBook() {
        try {
            System.out.println("ENTER ID OF BOOK AND STUDENT ROLL NUMBER FOR RETURNING BOOK");
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER BOOK ID:");
            String bookid = consoleInput.nextLine();
            System.out.println("ENTER ROLL NUMBER:");
            String studentId = consoleInput.nextLine();
            String sql = "DELETE FROM BORROWBOOKS WHERE BOOKID = '" + bookid + "' AND STUDENTID = '" + studentId + "'";
            ConnectionEstablishing.connectDataBase(sql, null);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
