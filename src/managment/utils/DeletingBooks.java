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
public class DeletingBooks {

    public static void deleteBookRecords() {
        try {
            System.out.println("ENTER DETAILS OF BOOK FOR DELETING");
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER BOOK NAME:");
            String bookname = consoleInput.nextLine();
            System.out.println("ENTER AUTHOR NAME:");
            String authorname = consoleInput.nextLine();
            String sql = "DELETE FROM BOOKDETAILS WHERE BOOKNAME = '" + bookname + "' AND AUTHOR = '" + authorname + "'";
            ConnectionEstablishing.connectDataBase(sql, "DELETE");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
