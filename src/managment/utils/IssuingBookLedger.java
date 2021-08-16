/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managment.utils;

import java.util.Scanner;
import managment.services.ConnectionEstablishingForGet;

/**
 *
 * @author Lenovo
 */
public class IssuingBookLedger {

    public static void printLedger() {
        try {
            Scanner consoleInput = new Scanner(System.in);
            System.out.println("ENTER ROLL NUMBER:");
            String rollNumber = consoleInput.nextLine();
            String sql = "SELECT BOOKID,STUDENTID,BORROWDATE,RETURNDATE FROM BORROWBOOKS WHERE STUDENTID = '" + rollNumber + "'";
            ConnectionEstablishingForGet.getDataBaseRecord(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);

        }
    }
}
