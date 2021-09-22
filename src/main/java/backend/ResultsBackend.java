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
public class ResultsBackend {
    
         public static String resultfilepath = "data\\results.txt";
       public static void addResult(String vs,String player1,String player2,String player3,String player4,String player5,String RHBTeam,String OtherTeam,int RHBScore,int OpponentScore,String location){
        try {
            FileWriter fw = new FileWriter(resultfilepath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(RHBTeam +"#"+ RHBScore+"#"+vs+"#"+OpponentScore+"#"+OtherTeam+"#"+location+"#"+player1+"#"+player2+"#"+player3+"#"+player4+"#"+player5);
            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");
            
        }
        
        
      
     }
       public static String getResults() {
        String output = "";

        try {
            File f = new File(resultfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.next();

                Scanner lineSc = new Scanner(line).useDelimiter("#");
                // pw.println(RHBTeam +"#"+ RHBScore+"#"+"vs"+"#"+OpponentScore+"#"+OtherTeam+"#"+location+"#"+player1+"#"+player2+"#"+player3+"#"+player4+"#"+player5);
                String RHBteam = lineSc.next();
                String RHBScore = lineSc.next();
                String vs = lineSc.next();
                String OpponentScore = lineSc.next();
                String OtherTeam = lineSc.next();
                String location = lineSc.next();
                String player1 = lineSc.next();
                String player2 = lineSc.next();
                String player3 = lineSc.next();
                String player4 = lineSc.next();
                String player5 = lineSc.next();
                
                


                output += String.format("%-10s %-10s %-10s %-10s  %-10s\n\n Location: %-15s\n\n%-10s \n%-10s\n%-10s\n%-10s\n%-10s ",RHBteam,RHBScore,vs,OpponentScore,OtherTeam,location,player1,player2,player3,player4,player5)+ "\n";
            }
            
            

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
}
