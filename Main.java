 import java.util.Scanner;
  public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Are you ready to vote -- true or false?");
    boolean ready = scan.nextBoolean();

    System.out.println("What is your first name?") ;
    String name = scan.next();

    System.out.println("What is your age?"); 
    int age = scan.nextInt();
      
    if (age >= 18 && ready) {
      System.out.println("Welcome to the voting poles!");
    } else {
      System.out.println("Sorry your are not eligible");
    }
  
      
    System.out.println("Thank you "+name+" for voting" ) ;
  }
}