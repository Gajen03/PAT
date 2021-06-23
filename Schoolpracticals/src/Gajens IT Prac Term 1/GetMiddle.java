import it.*;
import javax.swing.*;
import java.awt.*;


public class GetMiddle{
public static void main(String[] args){
  
   String word = JOptionPane.showInputDialog("Input Word:");
   int wordLen = word.length();
   int wordLen2 = wordLen/2;
   char mid = word.charAt(wordLen2);
   System.out.println(mid);
   
   



   }
   
}