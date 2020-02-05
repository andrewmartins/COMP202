import java.util.Random;
import java.util.Scanner;
public class BattleGame{
  // initializing an attribute of type Random
  private static Random randomObject = new Random();
  public static void main(String[] args){
    playGame("player.txt","monster.txt","spells.txt");
  }
  public static void playGame(String player, String monster, String spells){
    if(FileIO.readSpells(spells)==null){
      System.out.println("The game will be played without spells");
    }
    if(FileIO.readCharacter(player)==null){
      System.out.println("The game cannot be played");
    }
    else{
      // creating a player and their enemy as objects of type Character
      // the information to create objects of type Character are read from files and created
      // into objects of type Character using the readCharacter() method from the FileIO class
      // All the information is also displayed using Character method
      Character yoda = FileIO.readCharacter(player);
      String yodaName = yoda.getName();
      double yodaHealth = yoda.getMaxHealth();
      double yodaAttack = yoda.getAttackValue();
      int yodaWins = yoda.getNumWins();
      System.out.println("Name: " + yodaName);
      System.out.println("Health: " + yodaHealth);
      System.out.println("Attack: " + yodaAttack);
      System.out.println("Number of Wins: " + yodaWins);
      Character.setSpells(FileIO.readSpells(spells));
      System.out.println();
      Character.displaySpells();
      
      System.out.println();
      
      Character vader = FileIO.readCharacter(monster);
      String vaderName = vader.getName();
      double vaderHealth = vader.getMaxHealth();
      double vaderAttack = vader.getAttackValue();
      int vaderWins = vader.getNumWins();
      System.out.println("Name: " + vaderName);
      System.out.println("Health: " + vaderHealth);
      System.out.println("Attack: " + vaderAttack);  
      System.out.println("Number of Wins: " + vaderWins);
      System.out.println();
      
      Scanner read = new Scanner(System.in);
      if(yoda.getMaxHealth()>0&&vader.getMaxHealth()>0){
        while(yoda.getCurrHealth()>0||vader.getCurrHealth()>0){
          System.out.println("Enter A command");
          String action = read.nextLine();
          if(action.equals("attack")){
            // calculating the attack damage
            String yodaAttackDamage = String.format("%1$.2f",yoda.getAttackDamage(randomObject.nextInt()));
            System.out.println(yodaName + " attacks for " + yodaAttackDamage + " damage!");
            // inflicting the attack damage on the opposing character
            vader.takeDamage(Double.parseDouble(yodaAttackDamage));
            // printing out the current health if it is still above 0 or stating that the character was kicked out
            // if their health went below 0 after taking damage
            if(vader.getCurrHealth()<=0){
              System.out.println(vaderName + " was knocked out!");
              System.out.println();
              break;
            }
            System.out.println(vader.toString());
            System.out.println();
            
            // calculating the attack damage
            String vaderAttackDamage = String.format("%1$.2f",vader.getAttackDamage(randomObject.nextInt()));
            System.out.println(vaderName + " attacks for " + vaderAttackDamage + " damage!");
            // inflicting the attack damage on the opposing character
            yoda.takeDamage(Double.parseDouble(vaderAttackDamage));
            // printing out the current health if it is still above 0 or stating that the character was kicked out
            // if their health went below 0
            if(yoda.getCurrHealth()<=0){
              System.out.println(yodaName + " was knocked out!");
              System.out.println();
              break;
            }
            System.out.println(yoda.toString());
            System.out.println();
          }
          // terminating the method if the user enters quit
          else if(action.equals("quit")){
            System.out.println("Goodbye!");
            read.close();
            break;
          }
          // the following code is used when the user is trying to cast spells
          else{
            Random randomNumber = new Random();
            int seed = randomNumber.nextInt();
            // checks to see if the spell casted by the user did not succeed
            if(yoda.castSpell(action,seed)==0){
              System.out.println(yodaName + " tried to cast " + action + " but they failed!");
              System.out.println();
            }
            // checks to see if the spell attempted by the user has an incorrect name or was not part of the list provided
            if(yoda.castSpell(action,seed)==-1){
              System.out.println(yodaName + " tried to cast " + action + ", but they don't know that spell.");
            }
            // checks to see if the spell casted by the user did succeed
            else if(yoda.castSpell(action,seed)>0){
              System.out.println();
              System.out.println(yodaName + " casts " + action + "!");
              String damageFromSpell = String.format("%1$.2f",yoda.castSpell(action,seed));
              System.out.println("The casted spell did " + damageFromSpell + " damage!");
              vader.takeDamage(Double.parseDouble(damageFromSpell));
              System.out.println();
              if(vader.getCurrHealth()<=0){
                System.out.println(vaderName + " was knocked out!");
                System.out.println();
                break;
              }
              System.out.println(vader.toString());
            }
            // code that is the attack response by the monster that was seen earlier
            double vaderAttackDamage = vader.getAttackDamage(randomObject.nextInt());
            String vaderAttackStr = String.format("%1$.2f", vaderAttackDamage);
            System.out.println(vaderName + " attacks for " + vaderAttackStr + " damage!");
            yoda.takeDamage(vaderAttackDamage);
            System.out.println();
            // printing out the current health if it is still above 0 or stating that the character was kicked out
            // if their health went below 0
            if(yoda.getCurrHealth()<=0){
              System.out.println(yodaName + " was knocked out!");
              System.out.println();
              break;
            }
            System.out.println(yoda.toString());
          }
        }
        // a message is printed if the player's health goes below 0
        // the monster's wins increases by 1 --> the file gets rewritten
        if(yoda.getCurrHealth()<= 0){
          System.out.println("Oh no! You lost :(");
          vader.increaseWins();
          System.out.println("Successfully wrote to: " + monster);
          System.out.println(vaderName + " has won: " + vader.getNumWins() + " times");
          FileIO.writeCharacter(vader,"monster.txt");
          read.close();  
        }
        // a message is printed if the monster's health goes below 0
        // the player's wins increases by 1 --> the file gets rewritten
        else if(vader.getCurrHealth()<= 0){
          System.out.println("Fantastic! You killed the monster won!");
          yoda.increaseWins();
          System.out.println("Successfully wrote to: " + player);
          System.out.println(yodaName + " has won: " + yoda.getNumWins() + " times");
          FileIO.writeCharacter(yoda,player);
          read.close();
        }
      }
    }
  }
}