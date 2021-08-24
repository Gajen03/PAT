import javax.swing.*;
public class CardGame{
   public static void main(String[] args){  
   int totalPoints;

   String side= "";
   int type = 0;
   int attack;
   int defence;
   double luck;
   int len;
   double points;
   
   for(int i =1 ;i<=7;i++){
       String playername = JOptionPane.showInputDialog("Enter Player Name: ");
     
       
         if(type == 1){
            side = "Light";
         }else if(type == 2){
            side = "Dark";  
         }else{
            side = "Support";
         
         }
         
         System.out.println("\n\nPlayer "+i+":\t"+playername+" - "+side);
          for(int cards = 1;cards<=3;cards++){
        double typeD = Math.random() * (4-1) + 1;
        type = (int) typeD;
        
        double attackD = Math.random() * (6-1) + 1;
        attack = (int) attackD;
        
        double defenceD = Math.random() * (6-1) + 1;
        defence = (int) defenceD;
        
        luck = playername.length()/3.5; 
        luck = luck*10;
        luck = Math.round(luck);
        luck = luck/10 ; 
        
        points = (attack+defence)*luck;
        points= Math.round(points);
         
         System.out.println("Attack: "+attack+"\t Defence: "+defence+"\t Luck: "+luck+"\t Points: "+points);
        }
         
       
         
       
       
   }
   
   
   
   
   
   }
}