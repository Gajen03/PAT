import javax.swing.*;
public class ClacPrice{
   public static void main(String [] args){
      String priceStr = JOptionPane.showInputDialog("Input Price: ");
      double price = Double.parseDouble(priceStr);
      double discount_price = price - price*0.05;
      System.out.println(discount_price);
      double VAT = discount_price + discount_price*0.15;
      System.out.println(VAT);
      

   
   }
}