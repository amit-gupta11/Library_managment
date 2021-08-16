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
public class UpdateBookDatabase {

    public static void deleteBookRecords() {
        try {
            System.out.println("ENTER BOOK ID TO EDIT");
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER BOOK ID:");
            String bookid = consoleInput.nextLine();
            System.out.println("ENTER BOOK NAME:");
            String bookName = consoleInput.nextLine();
            System.out.println("ENTER BOOK AUTHOR:");
            String author = consoleInput.nextLine();
            System.out.println("ENTER BOOK SUBJECT:");
            String subject = consoleInput.nextLine();
            System.out.println("ENTER BOOK COPIES:");
            String copies = consoleInput.nextLine();
            System.out.println("ENTER BOOK PUBLISHED DATE:");
            String publishedDate = consoleInput.nextLine();
            String sql = "UPDATE  BOOKDETAILS SET BOOKNAME= '" + bookName + "' , AUTHOR='" + author + "', SUBJECT='" + subject + "', COPIES='" + copies + "', PUBLISHEDDATE='" + publishedDate + "' WHERE ID ='" + bookid + "' ";
            ConnectionEstablishing.connectDataBase(sql, null);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
