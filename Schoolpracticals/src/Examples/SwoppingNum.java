import javax.swing.*;
public class SwoppingNum{
   public static void main (String[] args){
      String num1Str = JOptionPane.showInputDialog("Enter First Number ");    
      int num1 = Integer.parseInt(num1Str);
      String num2Str = JOptionPane.showInputDialog("Enter Second Number ");    
      int num2 = Integer.parseInt(num2Str);
      
      int temp = num1;
       num1 = num2;
       num2 = temp;
      
      System.out.println(num1);
      System.out.print(num2);
   }
}