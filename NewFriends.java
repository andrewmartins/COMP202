import java.util.Scanner;
public class NewFriends{
  public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    
   
    
    System.out.println("How old are you?");
    
    int age = read.nextInt();
    read.nextLine();
    
    System.out.println("What's your name?");
    
    String name = read.nextLine();
    
    // whenever you type in inputs you put them in a buffer
    // when you type in your age and will read your characters until you it can no longer read a character. must clear your buffer before
    // try and read it again
    
   
    
    System.out.println(name + " you are " + age + " years old");
    
    
    read.close();
    
  }
  
  
}