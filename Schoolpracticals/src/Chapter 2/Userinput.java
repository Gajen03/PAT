import java.util.Scanner;

public class  Userinput {
   public static void mulitply (String [] args){
      Scanner scan = new Scanner(System.in);
      // asks for name
      System.out.println("Name:");
      String name = scan.nextLine();
      // asks for birthday
      System.out.println("Date of Birth:");
      String date = scan.nextLine();
      // ask for height
      System.out.println("Height(m):");
      String height = scan.nextLine();
      //ask for phone num
      System.out.println("Telephone/Cellphone number:");
      String phone = scan.nextLine();
      
      
      // prints out the result
      System.out.println("________________________________________________________");
      System.out.println(name);
      System.out.println();
      System.out.println(date);
      System.out.println();
      System.out.println(height);
      System.out.println();
      System.out.println(phone);
      System.out.println("________________________________________________________");
     }
     
   }      