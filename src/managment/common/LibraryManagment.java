/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managment.common;

import java.util.Scanner;
import managment.utils.AddingBookDetails;
import managment.utils.AddingStudentDetails;
import managment.utils.IssuingBookLedger;
import managment.utils.IssuingBooks;
import managment.utils.SearchingOfStudent;
import managment.utils.DeletingBooks;
import managment.utils.UpdateBookDatabase;
import managment.utils.BookReturn;

/**
 *
 * @author Lenovo
 */
public class LibraryManagment {

    public static void main(String[] args) {

        OUTER:
        while (true) {
            DisplayOptions.displayMenu();
            System.out.println("Please Enter Your Choice:");
            Scanner choiceInput = new Scanner(System.in);
            int choice = choiceInput.nextInt();
            switch (choice) {
                case 1 ->
                    AddingBookDetails.addingBook();
                case 2 ->
                    AddingStudentDetails.addingStudent();
                case 3 ->
                    IssuingBookLedger.printLedger();
                case 4 ->
                    IssuingBooks.bookIssue();
                case 5 ->
                    SearchingOfStudent.SearchingStudent();
                case 6 ->
                    DeletingBooks.deleteBookRecords();
                case 7 ->
                    UpdateBookDatabase.deleteBookRecords();
                case 8 ->
                    BookReturn.returningBook();
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
