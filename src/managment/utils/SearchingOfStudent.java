/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managment.utils;

import java.util.Scanner;
import managment.services.ConnectionEstablishingForGetStudentFullDetails;

/**
 *
 * @author Lenovo
 */
public class SearchingOfStudent {

    public static void SearchingStudent() {
        try {
            System.out.println("ENTER ROLL NUMBER FOR SEARCHING");
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER ROLL NUMBER:");
            String rollNumber = consoleInput.nextLine();
            String sql = "SELECT e1.rollno , e2.studentid ,e1.name, e1.email, e1.classname, e1.mobileno"
                    + " FROM STUDENTDETAILS e1 JOIN BORROWBOOKS e2 ON (e1.rollno = e2.studentid) where (e1.rollno='" + rollNumber + "')";
            System.out.println(sql);
            ConnectionEstablishingForGetStudentFullDetails.getStudentDataBaseRecord(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
