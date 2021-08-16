package managment.utils;

import java.util.Scanner;
import managment.services.ConnectionEstablishing;

public class ModifyingBookDB {

    public static void editingRecords() {
        try {
            System.out.println("ENTER BOOK ID TO EDIT");
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER BOOK ID:");
            String bookId = consoleInput.nextLine();
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
            String sql = "update  book_details set book_name= '" + bookName + "' , author='" + author + "', subject='" + subject + "', copy_num='" + copies + "', published_date='" + publishedDate + "' WHERE ID ='" + bookId + "' ";
            ConnectionEstablishing.querryUpdate(sql, null);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
