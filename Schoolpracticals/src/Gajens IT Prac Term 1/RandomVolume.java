import it.*;
import javax.swing.*;
import java.awt.*;


public class RandomVolume{
public static void main(String[] args){
   
  double height = 15.68;
  double min = 15;
  double max = 45;
  
  double radius =(int)(Math.random()*(45-15))+ 15;
   System.out.println("Random Radius: "+radius);
   
   double volume = 1/3.0*(Math.PI*Math.pow(radius,2)*height);
   System.out.println("Volume of Cone: "+volume);
   }
   
}