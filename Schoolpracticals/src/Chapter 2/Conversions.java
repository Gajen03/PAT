import javax.swing.*;

public class Conversions{
   public static void main(String[] arg){
   // input "first number
   
 

   String length = JOptionPane.showInputDialog("Input Length:");
   String width = JOptionPane.showInputDialog("Input Width:");
   
   double len = Double.parseDouble(length);
   double wid = Double.parseDouble(width);
    
    double area = len*wid;
    System.out.println(area);
    
    
//     double area = length*width;
//     System.out.println(area);  
   
   
   

  
  
 
   
      }
   }