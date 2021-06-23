import javax.swing.*;
public class Discount{
   public static void main(String[] args){
      
      String priceStr = JOptionPane.showInputDialog("Price: ");
      double price = Double.parseDouble(priceStr);
      
      System.out.println("Current Price : R"+ price);
      
      if(price > 100){
         double discount_calc = price*10/100.0;
         double discount_price = price-discount_calc;
         System.out.println("Discounted Price : R"+ discount_price);

      }
      else{
         System.out.println("Price : R"+ price);

      }
      
      

   }
}
   