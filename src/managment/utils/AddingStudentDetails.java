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
public class AddingStudentDetails {

    public static void addingStudent() {
        Scanner inputReader = null;
        try {
            inputReader = new Scanner(System.in);
            System.out.print("Enter ROLL NUMBER of Student: ");
            String rollno = inputReader.nextLine();

            System.out.print("Enter Name of Student: ");
            String name = inputReader.nextLine();

            System.out.print("Enter E-mail of Student: ");
            String email = inputReader.nextLine();

            System.out.print("Enter class of Student: ");
            String studentclass = inputReader.nextLine();

            System.out.print("Enter Mobile Number of Student: ");
            String mobilenumber = inputReader.nextLine();

            String sql = "INSERT INTO studentdetails(rollno, name, email, classname, mobileno) "
                    + "VALUES ('" + rollno + "', '" + name + "', '" + email + "', '" + studentclass + "', '" + mobilenumber + "' );";
            ConnectionEstablishing.connectDataBase(sql, null);

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
