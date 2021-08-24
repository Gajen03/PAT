import java.util.Arrays;
import javax.swing.*;
public class RPS{
   public static void main(String[] args){
     
      
      String intro = JOptionPane.showInputDialog("Welcome to Rock,Paper,Scissors \n a game that tests your skills to the extreme\n \n Press ENTER to contiune");
      String player1Str = JOptionPane.showInputDialog("Player 1 (type number only) \n 1 = Rock\n 2 = Papper \n 3 Scissors");
      int player1 = Integer.parseInt(player1Str);
      System.out.println(player1);

      
        int min = 1;
        int max = 4;
  
        int AI_player =(int)(Math.random()*(4-1))+ 1;
        System.out.println(AI_player);
   
        if(player1 == AI_player){
         System.out.println("Tie"+player1"v"+AI_player);
        }
   
     
     
    
      
      
      
   }
}