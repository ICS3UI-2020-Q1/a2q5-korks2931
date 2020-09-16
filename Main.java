import java.util.Scanner;

/**
 * This program will tell the user what to say depending on the number they have entered
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number to play FizzBuzz");
    // prompt the user for the number
    int number = input.nextInt();
    // declare a variable to store remainderone
   
    int remainderone = (number % 3);
    if (remainderone == 0){
      System.out.println("You should say Fizz");
    }
    // declare a variable to store remaindertwo
      int remaindertwo = (number % 5);
    if (remaindertwo == 0){
      System.out.println("You should say Buzz");
      
    }
  
    if (remainderone == 0 && remaindertwo == 0){
      System.out.println("You should say FizzBuzz ");

    } else if (remainderone > 0 && remaindertwo > 0){
      System.out.println("You should say " + number);
    }
  }

  }


