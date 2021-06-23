import javax.swing.*;
public class EggsSim{
   public static void main(String[] args){  
      
      int totalEggs = 25;
      double totalPowerD;
      String type = "";
      System.out.println("Total Eggs:"+ totalEggs+"\n\n");
      double numEggsD;
      int numEggs;
      int days;
      int sum;
      int eggType;
      double eggTypeD;
      int power;
      int maxPower = 0;
      int maxDays = 0;
               
      for( days = 1; days<=7;days++){
      int totalPower = 0;

            numEggsD = Math.random() * (9 - 2) + 2;
            numEggs = (int) numEggsD;
            
              if(numEggs<totalEggs){
               totalEggs = totalEggs-numEggs;
               System.out.println("\nDays "+days+":");
               System.out.println("Total Eggs: "+totalEggs);
               System.out.println("Eggs for the day : "+numEggs);
            }else if(numEggs>totalEggs){
               System.out.println("\nDays "+days+":");
               System.out.println("Total Eggs: "+totalEggs);
               System.out.println("Eggs for the day : "+numEggs);
               System.out.println("\n\n\nNo eggs Left");
                    break;

            }
            
        
            
          for(int i = 1;i<=numEggs;i++){
                
            eggTypeD =  Math.random() * (4 - 1) + 1;
            eggType = (int) eggTypeD;
            
            if(eggType == 1){
               type = "Elf";
               power = 430;
            }else if(eggType == 2){
               type = "Vampire";
               power = 320;
            }else{
               type = "Zombie";
               power = 175;
            }
            totalPower += power;
            System.out.println("Egg: "+i+"\tType: "+type+" \tPower: "+power);
            
       }
         if(totalPower > maxPower){
         maxPower = totalPower;
         maxDays = days;
        }
       System.out.println("Total Power for the day: "+totalPower);
       
     }
        System.out.println("\nMost amount of power was "+maxPower+" on Day "+ maxDays); 
   }
}


