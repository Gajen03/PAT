/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;


import java.io.BufferedWriter;
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
    public static void editBoysStats(String name,String nameCheck) {
	String tempfile = "temp.txt";	
        File oldfile = new File(boyssquadfilepath);
        File newfile = new File(tempfile);
        try {
              
             FileWriter fw = new FileWriter(tempfile,true);
             PrintWriter pw  = new PrintWriter(fw);
             Scanner sc = new Scanner(new File(boyssquadfilepath)).useDelimiter("#");
		
             while(sc.hasNext()){
                name = sc.next();
                String surname = sc.next();
                String position = sc.next();
                String goals = sc.next();
                String rating = sc.next();
                
                if(name.equals(name)){
                    pw.println(name+"#"+surname+"#"+goals+1+"#"+rating+0.5);
                }else{
                    pw.println(name+"#"+surname+"#"+goals+"#"+rating);
                }
             }
             
      
             
             
             sc.close();
             pw.flush();
             pw.close();
             oldfile.delete();
             File dump = new File(boyssquadfilepath);
             newfile.renameTo(dump);
        
        } catch (FileNotFoundException ex) {
		System.out.println("Students file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
	}
}

