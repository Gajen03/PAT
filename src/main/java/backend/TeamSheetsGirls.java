/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import static backend.TeamSheetsBoys.boyssquadfilepath;
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
    public static String girlssquadfilepath = "data\\statsGirls.txt";
    //gets all the stating 11 players for the girls squad
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
     //gets all the subs players for the girls squad
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


                
                output += String.format("Name: %-10s Surname: %-15s  %-15s  %-15s",name,surname,cap,number) + "\n";
            
            }
            
            
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
    // gets the number of girs so you can use it in an array
    private static int getNumGirlsP() {
		try {
			Scanner sc = new Scanner(new File(girlssquadfilepath));
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
     // puts are the girls names and surnames in an array so it can be displayed in a combo box
    public static String[] getGirlsAsArray() {
		try {
			Scanner sc = new Scanner(new File(girlssquadfilepath));
                                               
			int numboys = getNumGirlsP();
			String[] outputArr = new String[numboys];
			int currentIndex = 0;
			while (sc.hasNextLine()) {
                                                                String line = sc.nextLine();
                                                                Scanner lineSc = new Scanner(line).useDelimiter("#");
                                                                String name = lineSc.next();
                                                                String surname = lineSc.next();
                                                                
				outputArr[currentIndex] = name +  " " + surname ;
				currentIndex++;
			}
			sc.close();
			return outputArr;
		} catch (FileNotFoundException ex) {
			System.out.println("Player file not found");
			return null;
		}
	}
      // method allows you to add players to the girls squad 
    public static void addGirls(String name, String surname,String number,String cap){
        try {
            FileWriter fw = new FileWriter(subfilepath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("\n"+name +"#"+ surname+"#"+number+"#"+cap);
            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");
            
        }
      }
// method allows you to delete players from the girls squad ( starting 11) 
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
// method allows you to delete players from the girls squad ( subs)
    public static void deleteGirlsSubs(String name, String surname,String number,String cap){
            try {
			Scanner sc = new Scanner(new File(subfilepath));
			String output = "";
			String playerName = name +"#"+ surname+"#"+number+"#"+cap;
                        
                        

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(playerName)) {
                                                                         if(!sc.hasNext()){
                                                                             output += line;
                                                                         }else{
                                                                             output += line+"\n";
                                                                         }
					
					
			 	
			
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
 //// method allows you to add stats of players to statsGirls textfile indirectly as it takes infomation from the add players  and add fixture method input
    public static void addGirlsToStats(String name, String surname,String poistion){
        try {
            FileWriter fw = new FileWriter(girlssquadfilepath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(name +"#"+ surname+"#"+poistion+"#"+"0"+"#"+"5.0");
            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");
            
        }


 }
    //// method allows you to delets stats of players from statsGirls textfile indirectly as it takes infomation from the add players  and add fixture method input
public static void deleteGirlsStats(String name, String surname,String poistion) {
		try {
			Scanner sc = new Scanner(new File(girlssquadfilepath));
			String output = "";
			String playerName = name +"#"+ surname+"#"+poistion+"#"+"0"+"#"+"5.0";

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (!line.equalsIgnoreCase(playerName)) {
					output += line + "\n";
				
			
				}
			}
			sc.close();
                        

			PrintWriter pw = new PrintWriter(new FileWriter(girlssquadfilepath, false));
			pw.print(output);
			pw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
	}

}