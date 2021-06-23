import it.*;
import javax.swing.*;
import java.awt.*;

public class HotelCalc{
   public static void main(String[] args){
    
    double hotel_cost = 490.90;
   
    String numPeopleStr = JOptionPane.showInputDialog("Hi, How many people will be staying with us? The cost per night is R490.90");
    String numNightsStr = JOptionPane.showInputDialog("Num nights?");
    System.out.println(numPeopleStr);
    System.out.println(numNightsStr);
    int numPeopleInt = Integer.parseInt(numPeopleStr);       
    int numNightsInt = Integer.parseInt(numNightsStr);
    double sum = numNightsInt*hotel_cost*numPeopleInt;
    System.out.println(sum);
    double sum1 = sum*10/110;
    double sum2 = sum-sum1;
    System.out.println("The total cost with a 10% discount is:");
    System.out.println(sum2);
   }
      
}