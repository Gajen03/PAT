import javax.swing.*;
public class TestAnotherNumber{
   public static void main(String[] args){
      
      String numInputStr = JOptionPane.showinputDialog("Enter num");
      int numInput = Integer.parseInt(numInputStr);
      
      if(numInput < 0){
         System.out.println("Number is negative");
      }
      else{
         System.out.println("Number is Positive");
      }
      
      
      
      if(numInput % 2 == 0){
         System.out.println("Number is even");
      }
      else{
         System.out.println("Number is odd");
      }
      
      
      
      if(numInput % 7 ==0){
         System.out.println("Number is a mulitple of 7");
      }
      else{
         System.out.println("Number is not a multiple of 7");
      }

   }
}