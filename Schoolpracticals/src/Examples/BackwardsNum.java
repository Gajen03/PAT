import javax.swing.*;
public class BackwardsNum{
   public static void main(String[] arg){
      
      String num = JOptionPane.showInputDialog("Enter Number: ");
   
      
         for(int i=num.length()-1;i>=0;i--){
         System.out.print(num.charAt(i));
         }
      
 }
}
  