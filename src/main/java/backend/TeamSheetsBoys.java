  
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
 * @author Gajendran
 */
public class TeamSheetsBoys {
    
    public static String playerfilepath = "data\\boyTS.txt";
    public static String subfilepath = "data\\subTS.txt";
    public static String boyssquadfilepath = "data\\statsBoys.txt";
//gets all the stating 11 players from the boys squad textfile
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
    // puts are the boys names and surnames in an array so it can be displayed in a combo box
     private static int getNumBoysP() {
		try {
			Scanner sc = new Scanner(new File(boyssquadfilepath));
                        sc.useDelimiter("#");
			int count = 0;
			while (sc.hasNextLine()) {
				sc.nextLine();
				count++;
			}
			sc.close();
			return count;
		} catch (FileNotFoundException ex) {
			System.out.println("Player file not found");
			return -1;
		}
	}
       // gets the number of boys so you can use it in an array
     public static String[] getBoysAsArray() {
		try {
			Scanner sc = new Scanner(new File(boyssquadfilepath));
                                               
			int numboys = getNumBoysP();
			String[] outputArr = new String[numboys];
			int currentIndex = 0;
			while (sc.hasNextLine()) {
                            
                                String line = sc.nextLine();
                                Scanner lineSc = new Scanner(line).useDelimiter("#");
                                String name = lineSc.next();
                                String surname = lineSc.next();
                                                                
				outputArr[currentIndex] = name + " " + surname ;
				currentIndex++;
			}
			sc.close();
			return outputArr;
		} catch (FileNotFoundException ex) {
			System.out.println("Player file not found");
			return null;
		}
	}
      //gets all the sub players from the boys squad textfiel
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
     // method allows you to get input from the manage students section of the teamsheetsboys screen 
    //   and add players to the boys squad ( this includes name,surname,position,number)
     public static void addBoys(String name, String surname,String number,String cap){
        try {
            FileWriter fw = new FileWriter(subfilepath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(name +"#"+ surname+"#"+number+"#"+cap);
            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");
            
        }
        
        
      
     }
     // method allows you to delete players from the boys squad using inputs from the manage 
    //students section of the teamsheetsboys screen( this includes name,surname,position,number for the stating 11 players)
     public static void deleteBoysP(String name, String surname,String number,String cap) {
		try {
			Scanner sc = new Scanner(new File(playerfilepath));
			String output = "";
			String playerName = name +"#"+ surname+"#"+number+"#"+cap;

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(playerName)) {
					output += line + "\n";
				
			
				}
			}
			sc.close();
                        

			PrintWriter pw = new PrintWriter(new FileWriter(playerfilepath, false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
	}
  /// method allows you to delete players from the boys squap using inputs from the manage 
    //students section of the teamsheetsboys screen( this includes name,surname,position,number for the subs in the girls squad)
     public static void deleteBoysS(String name, String surname,String number,String cap){
            try {
			Scanner sc = new Scanner(new File(subfilepath));
			String output = "";
			String playerName = name +"#"+ surname+"#"+number+"#"+cap;

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(playerName)) {
					output += line +"\n";
			 	
			
				}
			}
                        
			sc.close();
                        

			PrintWriter pw = new PrintWriter(new FileWriter(subfilepath, false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
        }
 //// method allows you to add stats of players to statsGirls textfile indirectly as it takes infomation from the add players  and add fixture method inpuy  
    public static void addBoysToStats(String name, String surname,String poistion){
        try {
            FileWriter fw = new FileWriter(boyssquadfilepath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(name +"#"+ surname+"#"+poistion+"#"+"0"+"#"+"5.0");
            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");
            
        }
        
        
      
     }
    //// method allows you to delets stats of players from statsGirls textfile indirectly as it takes infomation from the add players  and add fixture method input
    public static void deleteBoysStats(String name, String surname,String poistion) {
		try {
			Scanner sc = new Scanner(new File(boyssquadfilepath));
			String output = "";
			String playerName = name +"#"+ surname+"#"+poistion+"#"+"0"+"#"+"5.0";

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(playerName)) {
					output += line + "\n";
				
			
				}
			}
			sc.close();
                        

			PrintWriter pw = new PrintWriter(new FileWriter(boyssquadfilepath, false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
	}
}
