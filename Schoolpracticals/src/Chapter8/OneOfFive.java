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
public class OneOfFive {
    public static void main(String[] args) {
        
    
    
    
    
    String choiceStr = JOptionPane.showInputDialog("*Type number of team only*\nWhich Team is the best:\n1.)Liverpool\n2.)Manchester United\n3.)Chelsea\n4.)Barcelona\n5.)Real Madrid");
    int choice = Integer.parseInt(choiceStr);
    
    
    if(choice == 1){
        System.out.println("You Chose Liverpool");
        
    }
    else if(choice == 2){
        System.out.println("You Chose Manchester United");
        
    }
    else if(choice == 3){
        System.out.println("You Chose Chelea");
        
    }
    else if(choice == 4){
        System.out.println("You Chose Barcelona");
        
    }
    else if(choice == 5){
        System.out.println("You Chose Real Mardrid");
        
    }
  }
}
