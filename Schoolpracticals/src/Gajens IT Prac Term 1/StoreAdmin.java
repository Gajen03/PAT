import it.*;
import javax.swing.*;
import java.awt.*;


public class StoreAdmin{
public static void main(String[] args){

    double coke_price = 13.90;
    double barone_price = 12.00;
    double water_price = 9.50;
    
    String cokenum = JOptionPane.showInputDialog("How many CocaCola:");
    int coke = Integer.parseInt(cokenum);
    System.out.println("Cokes:"+coke);
    String baronenum = JOptionPane.showInputDialog("How many BarOne Choclates:");
    int barone = Integer.parseInt(baronenum);
    System.out.println("Barone:"+barone);
    String waternum = JOptionPane.showInputDialog("How many Bottled Waters:");
    int water = Integer.parseInt(waternum);
    System.out.println("Wate:"+water);

    double coke_total = coke*coke_price;
    double barone_total = barone*barone_price;
    double water_total = water*water_price;
    
    double sum = water_total + barone_total + coke_total;
    System.out.println("Total Amount: R"+sum);
   }
   
}