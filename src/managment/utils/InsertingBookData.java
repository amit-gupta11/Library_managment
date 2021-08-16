
package managment.utils;

import java.util.Scanner;
import managment.services.ConnectionEstablishing;


public class InsertingBookData {

    public static void insertData() {
        Scanner inputReader = null;
        try {
            inputReader = new Scanner(System.in);

            System.out.print("Enter Book name: ");
            String bookName = inputReader.nextLine();

            System.out.print("Enter Book Author: ");
            String author = inputReader.nextLine();

            System.out.print("Enter Book Subject: ");
            String subject = inputReader.nextLine();

            System.out.print("Enter Number Of Copies: ");
            String copyNumber = inputReader.nextLine();

            System.out.print("Enter Publish Date of Book: ");
            String publishedDate = inputReader.nextLine();

            String sql = "insert into book_details(book_name, author, subject, copy_num, published_date) "
                    + "VALUES ('" + bookName + "', '" + author + "', '" + subject + "', '" + copyNumber + "', '" + publishedDate + "' );";
            ConnectionEstablishing.querryUpdate(sql, null);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }

}
