/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import javax.swing.JOptionPane;

/**
 *
 * @author CLLB15
 */
public class OneOfFiveSwitchCase {
    public static void main(String[] args) {
        
        
      
     String choiceStr = JOptionPane.showInputDialog("*Type number of team only*\n\nWhich Team is the best:\n1.)Liverpool\n2.)Manchester United\n3.)Chelsea\n4.)Barcelona\n5.)Real Madrid");
     int choice = Integer.parseInt(choiceStr);
     
     switch(choice){
         case 1:
             System.out.println("You chose Liverpool");
             break;
         case 2:
             System.out.println("You chose Manchester United");
             break;
         case 3:
             System.out.println("You chose Chelea");
             break;
         case 4:
             System.out.println("You chose Barcelona");
             break;
         case 5:
             System.out.println(" You chose Real Madrid");
                
     }
        
        
        
        
        
    }
    
}
