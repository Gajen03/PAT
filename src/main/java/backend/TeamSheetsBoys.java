/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class TeamSheetsBoys {
    
    public static String playerfilepath = "data\\boyTS.txt";
    public static String subfilepath = "data\\subTS.txt";

    public static String getBoysP() {
        String output = "";

        try {
            File f = new File(playerfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.next();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                String surname = lineSc.next();
                String number = lineSc.next();
                String cap = lineSc.next();
                


                output += String.format("Name: %-10s Surname: %-10s  %-15s Number %-10s",name,surname,cap,number) + "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
     public static String getBoysS() {
        String output = "";

        try {
            File f = new File(subfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.next();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                String surname = lineSc.next();
                String number = lineSc.next();
                String cap = lineSc.next();


                output += String.format("Name: %-10s Surname: %-10s  %-15s Number %-10s",name,surname,cap,number) + "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
}