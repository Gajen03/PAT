import javax.swing.*;
public class TempConversion{
   public static void main(String[] args){
   
      String celsiusStr = JOptionPane.showInputDialog("Enter degrees in Celsius :");
      double celsius = Double.parseDouble(celsiusStr);
      
      double sum = 9*celsius/5.0;
      double fahrenheit_sum = sum + 32;
      System.out.println(fahrenheit_sum);
     
   }
}