import java.util.Arrays;
import javax.swing.*;
public class NameNum{
   public static void main(String[] args){
      
      String nameStr = JOptionPane.showInputDialog("Enter name: ");
      int len = nameStr.length();
      
      if(len % 2 == 0){
       System.out.println("Name is even");
      }
      else{
         System.out.println("Name is odd");
      }
   
   }
}