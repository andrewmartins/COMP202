import java.util.Scanner;
public class GuessIt{
  public static void main(String[] args){
    int toGuess = (int)(Math.random()*100+1);
    Scanner read = new Scanner(System.in);
    System.out.println("What's your guess?");
    
    int guess = read.nextInt();
    int tries = 1; 
    
    while(guess != toGuess){
      if(guess<toGuess){
        System.out.print("Too low! ");
      }
      else {
        System.out.print("Too high! ");
      }
      System.out.println("Try again");
      guess = read.nextInt();
      tries++;
    }
    System.out.println("You got it! It took you " + tries + " tries");
    read.close();
  }
}
           