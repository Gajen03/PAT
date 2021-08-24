import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    System.out.print("Enter first number : ");
    double first = reader.nextDouble();
    // nextDouble() reads the next double from the keyboard
    System.out.print("Enter second number : ");
    double second = reader.nextDouble();
    
    System.out.println(" Type operation ");
    System.out.println(" + (Plus)");
    
    System.out.println(" - (Minus)");
    
    System.out.println(" * (Miltipy)");
    
    System.out.println(" / (Divied)");
    char operator = reader.next().charAt(0);

    double result;

    switch (operator) {
      case '+':
        result = first + second;
        break;

      case '-':
        result = first - second;
        break;

      case '*':
        result = first * second;
        break;

      case '/':
        result = first / second;
        break;

      // operator doesn't match any case constant (+, -, *, /)
      default:
        System.out.printf("Error! operator is not correct");
        return;
    }

    System.out.println(first + " " + operator + " " + second + " = " + result);
            }
       }