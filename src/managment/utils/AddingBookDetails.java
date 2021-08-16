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
public class AddingBookDetails {

    public static void addingBook() {
        Scanner inputReader = null;
        try {
            inputReader = new Scanner(System.in);

            System.out.print("Enter Book name: ");
            String bookname = inputReader.nextLine();

            System.out.print("Enter Book Author: ");
            String author = inputReader.nextLine();

            System.out.print("Enter Book Subject: ");
            String subject = inputReader.nextLine();

            System.out.print("Enter Number Of Copies: ");
            String copynumber = inputReader.nextLine();

            System.out.print("Enter Publish Date of Book: ");
            String publisheddate = inputReader.nextLine();

            String sql = "INSERT INTO bookdetails(bookname, author, subject, copies, publisheddate) "
                    + "VALUES ('" + bookname + "', '" + author + "', '" + subject + "', '" + copynumber + "', '" + publisheddate + "' );";
            ConnectionEstablishing.connectDataBase(sql, null);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }

}
