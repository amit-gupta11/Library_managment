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

    public static void vanishingBooks() {
        try {
            System.out.println("ENTER DETAILS OF BOOK FOR DELETING");
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER BOOK NAME:");
            String bookName = consoleInput.nextLine();
            System.out.println("ENTER AUTHOR NAME:");
            String authorName = consoleInput.nextLine();
            String sql = "delete from book_details where book_name = '" + bookName + "' and author = '" + authorName + "'";
            ConnectionEstablishing.querryUpdate(sql, "DELETE");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
