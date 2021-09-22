/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import static backend.TeamSheetsBoys.playerfilepath;
import static backend.TeamSheetsBoys.subfilepath;
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
public class TeamSheetsGirls {
    
    public static String playerfilepath = "data\\girlTS.txt";
    public static String subfilepath = "data\\subGTS.txt";
    public static String getGirlsP() {
        String output = "";

        try {
            File f = new File(playerfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.nextLine();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                String surname = lineSc.next();
                String number = lineSc.next();
                String cap = lineSc.next();


                output += String.format("Name: %-10s Surname: %-15s  %-15s  %-15s",name,surname,cap,number) + "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
     public static String getGirlsS() {
        String output = "";

        try {
            File f = new File(subfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNextLine()) {
              String line = fileSc.next();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                String surname = lineSc.next();
                String number = lineSc.next();
                String cap = lineSc.next();

//                output += "Name: " + name + "\t\t\tSurname: " + surname + "\t\t\t"+"Number: "+number+"\n";
               output += String.format("Name: %-10s Surname: %-15s  %-15s  %-15s",name,surname,cap,number) + "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
     private static int getNumGirlsP() {
		try {
			Scanner sc = new Scanner(new File(playerfilepath));
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
     public static String[] getGirlsAsArray() {
		try {
			Scanner sc = new Scanner(new File(playerfilepath));
                                               
			int numboys = getNumGirlsP();
			String[] outputArr = new String[numboys];
			int currentIndex = 0;
			while (sc.hasNextLine()) {
                                                                String line = sc.nextLine();
                                                                Scanner lineSc = new Scanner(line).useDelimiter("#");
                                                                String name = lineSc.next();
                                                                String surname = lineSc.next();
                                                                
				outputArr[currentIndex] = name + "" + surname ;
				currentIndex++;
			}
			sc.close();
			return outputArr;
		} catch (FileNotFoundException ex) {
			System.out.println("Player file not found");
			return null;
		}
	}
      public static void addGirls(String name, String surname,String number,String cap){
        try {
            FileWriter fw = new FileWriter(subfilepath, true);
            PrintWriter pw = new PrintWriter(fw);
//            name = JOptionPane.showInputDialog("Enter Book Name");
//            author = JOptionPane.showInputDialog("Enter Book Author");
            pw.print("\n"+name +"#"+ surname+"#"+number+"#"+cap);
            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");
            
        }
      }
public static void deleteGirlsPlayers(String name, String surname,String number,String cap) {
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
        public static void deleteGirlsSubs(String name, String surname,String number,String cap){
            try {
			Scanner sc = new Scanner(new File(subfilepath));
			String output = "";
			String playerName = name +"#"+ surname+"#"+number+"#"+cap;

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(playerName)) {
					output += line +"\n" ;
			 	
			
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
}
