import java.util.Arrays;
import javax.swing.*;
public class Easter{
   public static void main(String[] args){
   
      String aStr = JOptionPane.showInputDialog("Enter Year between:");
      int a1 = Integer.parseInt(aStr);
      int a = a1 - 1900;
      int b = a%19;
      int c = (7*b+1)/19;
      int d = (11*b+4-c)%29;
      int e = a/4;
      int f = (a+e+31-d)%7;
      int g = 25-d-f;
 


      if(g > 0){
        
         System.out.println("April "+g);
      }else{
         int date2 = 31-g;
         System.out.println("March "+date2 );
      }

     
   }
}