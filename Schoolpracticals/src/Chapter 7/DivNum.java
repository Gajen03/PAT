import java.util.Arrays;
import javax.swing.*;
public class DivNum{
   public static void main(String[] args){
      
      String num1Str = JOptionPane.showInputDialog("Enter and number");
      double num1 = Integer.parseInt(num1Str);
      String num2Str = JOptionPane.showInputDialog("Enter and number");
      double num2 = Integer.parseInt(num2Str);
      
      if(num2 == 0){
         System.out.println("Error input = 0");
      }
      else{
         double sum = num1/num2;
         System.out.println(sum);
      }
   
   
   } 
}