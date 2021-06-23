import java.util.Scanner;

public class  Task {
   public static void main (String [] args){
      Scanner scan = new Scanner(System.in);
       
       // asks the user for the length of the rectangle
      System.out.println("Enter length:");
          int length = scan.nextInt();
      // ask the user of the width of the rectangle 
       System.out.println("Enter width:");
          int width = scan.nextInt();
      // prints out output
       System.out.println(length*width);
       
      // space
      System.out.println("__________________________________________________________");
      // asks the user for the radius of the cicle
      System.out.println("Enter Radius");
          int radius = scan.nextInt();
    // prints out output
      System.out.println(Math.PI*radius*radius);

      // space
      System.out.println("__________________________________________________________");
      
      //asks user for name
      System.out.println("Enter Name");
          String name = scan.nextLine();
      //asks user for surname
      System.out.println("Enter Surname");
          String surname = scan.nextLine();
      // asks user for their email adress adress
      System.out.println("Enter gmail:");
          String adress = scan.nextLine();
      
      // takes the user input for the name,surname and gmail and joins it as one vaiable called person
      String person = name + ""+ surname +""+ adress;
      //prints out input
      System.out.println(person);
      
      
      }
      
   }