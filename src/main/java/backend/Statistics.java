/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author SWG_T28
 */
public class Statistics {
    
    public static String topscorerBfilepath = "data\\topscoresboys.txt";
    public static String topscorerGfilepath = "data\\topscoresgirls.txt";
    public static String boyssquadfilepath = "data\\statsBoys.txt";
    public static String girlssquadfilepath = "data\\statsGirls.txt";
    
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
                


                output += String.format("Name: %-10s Surname: %-10s  Goals: %-5s  ",name,surname,goalNum) + "\n";
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
                


                output += String.format("Name: %-10s Surname: %-10s  Goals: %-5s   ",name,surname,goalNum) + "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
    public static String fixtures(){
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
                


                output += String.format("Name: %-10s Surname: %-10s  %-15s",name,surname,goalNum) + "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
    
    
    
    public static String getBoysStats() {
        String output = "";

        try {
            File f = new File(boyssquadfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.next();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                String surname = lineSc.next();
                String position = lineSc.next();
                String goals = lineSc.next();
                String rating = lineSc.next();


                output += String.format("Name: %-10s Surname: %-45s  %-15s %-15s %-15s",name,surname,position,goals,rating) + "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    } 
    public static String getGirlsStats() {
        String output = "";

        try {
            File f = new File(girlssquadfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.next();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                String surname = lineSc.next();
                String position = lineSc.next();
                String goals = lineSc.next();
                String rating = lineSc.next();


                output += String.format("Name: %-10s Surname: %-45s  %-15s %-15s %-15s",name,surname,position,goals,rating) + "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    } 
   
   public static void addBoyStats(String nameIn,String surnameIn) {
        String output = "";

        try {
            File f = new File(girlssquadfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.next();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                
                String name = lineSc.next();
                String surname = lineSc.next();
                String position = lineSc.next();
                String goals = lineSc.next();
                String rating = lineSc.next();

                if(name.equals(nameIn) && surname.equals(surnameIn)){
                    int newGoals = Integer.parseInt(goals) + 1;
                    double newRating = Double.parseDouble(rating)+0.5;
                    
                    output += name + "#" + surname + "#" + position+"#"+newGoals+"#"+newRating+"\n";
                }else{
                    output += name + "#" + surname + "#" + position+"#"+goals+"#"+rating+"\n";
                }
            }
            
           PrintWriter pw = new PrintWriter(f);
            pw.println(output.trim());
            pw.close();

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
       
    } 
    public static void addGirlStats(String nameIn,String surnameIn) {
        String output = "";

        try {
            File f = new File(girlssquadfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.next();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                
                String name = lineSc.next();
                String surname = lineSc.next();
                String position = lineSc.next();
                String goals = lineSc.next();
                String rating = lineSc.next();

                if(name.equals(nameIn) && surname.equals(surnameIn)){
                    int newGoals = Integer.parseInt(goals) + 1;
                    double newRating = Double.parseDouble(rating)+ 0.5;
                    
                    output += name + "#" + surname + "#" + position+"#"+newGoals+"#"+newRating+"\n";
                }else{
                    output += name + "#" + surname + "#" + position+"#"+goals+"#"+rating+"\n";
                }
            }
            
           PrintWriter pw = new PrintWriter(f);
            pw.println(output.trim());
            pw.close();

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
       
    } 	
}

