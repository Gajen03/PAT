import javax.swing.*;
public class CopareNumChars{
   public static void main(String[] args){
      
      String word1 = JOptionPane.showInputDialog("Enter the first word");
      int len1 = word1.length();
      String word2 = JOptionPane.showInputDialog("Enter the second word");
      int len2 = word2.length();
      
      if(len1>len2){
         System.out.println(word1+" "+" > "+" "+word2);
      }
      else if(len2>len1){
         System.out.println(word1+" "+" < "+" "+word2);
      }
      else if(len1==len2){
         System.out.println(word2+" "+" = "+" "+word1);;
      }
      
   }
}