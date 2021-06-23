import it.*;
import javax.swing.*;
import java.awt.*;

public class CapitalT{
   public static void main(String[] args){
   
     Gogga bug = new Gogga();
     bug.setColor(Color.BLUE);
     bug.move();
     bug.move();
     bug.move();
     bug.move();
     bug.setPosition(5,1);
     bug.setDirection(Gogga.RIGHT);
     bug.move();
     bug.move();
     bug.move();
     bug.move();

     System.out.println("X position: " + bug.getXPos() + " - Y position: " + bug.getYPos());
     
     
   }   
}