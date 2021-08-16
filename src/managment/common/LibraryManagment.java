package managment.common;

import java.util.Scanner;
import managment.utils.*;

public class LibraryManagment {

    public static void main(String[] args) {

        OUTER:
        while (true) {
            MenuForDisplaying.menu();
            System.out.println("Please Enter Your Choice:");
            Scanner choiceInput = new Scanner(System.in);
            int choice = choiceInput.nextInt();
            switch (choice) {
                case 1 ->
                    InsertingBookData.insertData();
                case 2 ->
                    InsertingStudentData.insertData();
                case 3 ->
                    IssuedBookLedger.fetchLedger();
                case 4 ->
                    BookIssuing.issuingBook();
                case 5 ->
                    FindStudentFromLedger.fetchData();
                case 6 ->
                    DeletingBooks.vanishingBooks();
                case 7 ->
                    ModifyingBookDB.editingRecords();
                case 8 ->
                    ReturningIssuedBooks.modifyingLedger();
                case 9 -> {
                    System.out.println("Exiting BOOK MANAGMENT SYSTEM!");
                    break OUTER;
                }
                default ->
                    System.out.println("INVALID INPUT");
            }
        }
    }
}
