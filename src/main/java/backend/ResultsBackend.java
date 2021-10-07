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
// gets the input from the add results screeen and addes it to the result text file(including..)
    public static void addResult(String vs,String player1Name,String player1Surname,String  player2Name,String player2Surname,String player3Name,String player3Surname,String player4Name, String player4Surname,String  player5Name,String player5Surname, String RHBTeam, String OtherTeam, int RHBScore, int OpponentScore, String location) {
        try {
            FileWriter fw = new FileWriter(resultfilepath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(RHBTeam + "#" + RHBScore + "#" + vs + "#" + OpponentScore + "#" + OtherTeam + "#" + location + "#" + player1Name + "#" + player1Surname + "#" + player2Name + "#" + player2Surname +"#" + player3Name + "#" + player3Surname +"#" + player4Name + "#" + player4Surname + "#" + player5Name + "#" + player5Surname +  "#");
            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");

        }

    }
 // gets and displays all game results for all boys and girls games
    public static String getResults() {
        String output = "";

        try {
            File f = new File(resultfilepath);
            Scanner fileSc = new Scanner(f);

            while (fileSc.hasNext()) {
                String line = fileSc.next();
                Scanner lineSc = new Scanner(line).useDelimiter("#");

                String RHBteam = lineSc.next();
                String RHBScore = lineSc.next();
                String vs = lineSc.next();
                String OpponentScore = lineSc.next();
                String OtherTeam = lineSc.next();
                String location = lineSc.next();
                String player1Name = lineSc.next();
                String player1Surname = lineSc.next();
                String player2Name = lineSc.next();
                String player2Surname = lineSc.next();
                String player3Name = lineSc.next();
                String player3Surname = lineSc.next();
                String player4Name = lineSc.next();
                String player4Surname = lineSc.next();
                String player5Name = lineSc.next();
                String player5Surname = lineSc.next();
                String divider = "------------------------------------------------------------------------------------------------";

                output += String.format("%-10s %-10s %-10s %-10s  %-10s\n\nLocation: %-15s\n\n%-10s %-10s \n%-10s %-10s\n%-10s %-10s\n%-10s %-10s\n%-10s %-10s\n\n%-10s", RHBteam, RHBScore, vs, OpponentScore, OtherTeam, location, player1Name,player1Surname, player2Name,player2Surname, player3Name,player3Surname, player4Name,player4Surname, player5Name,player5Surname, divider) + "\n";
            }

        } catch (FileNotFoundException ex) {

            System.out.println("File Not Found");
        }
        return output;
    }
}
