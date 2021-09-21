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
 * @author SWG_T28
 */
public class Statistics {
    
    public static String topscorerBfilepath = "data\\topscoresboys.txt";
    public static String topscorerGfilepath = "data\\topscoresgirls.txt";
    public static String topScorers() {
        String output = "";

        try {
            File f = new File(topscorerBfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.next();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                String surname = lineSc.next();
                String goalNum = lineSc.next();
                


                output += String.format("Name: %-10s Surname: %-10s  %-20s Number ",name,surname,goalNum) + "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
    public static String topScorersG(){
          String output = "";

        try {
            File f = new File(topscorerGfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.next();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                String surname = lineSc.next();
                String goalNum = lineSc.next();
                


                output += String.format("Name: %-10s Surname: %-10s  %-20s Number ",name,surname,goalNum) + "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
 }

