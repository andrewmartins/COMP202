import java.util.Random;
import java.util.ArrayList;
public class Character{
  //initializing the attributes for objects of type Character
  private String name;
  private double attack;
  private double maxHealth;
  private double currentHealth;
  private int numOfWins;
  private static ArrayList<Spell> spells = new ArrayList<Spell>();
  
  // the constructor used to build objects of type Character
  public Character(String name, double attack, double maxHealth, int numOfWins){
    this.name = name;
    this.attack = attack;
    this.maxHealth = maxHealth;
    this.numOfWins = numOfWins;
    this.currentHealth = maxHealth;
  }
  // a method to retrieve the name of the Character
  public String getName(){
    return this.name;
  }
  // a method to retrieve the Attack value
  public double getAttackValue(){
    return this.attack;
  }
  // a method to retrieve the Max Health of an object of type Character
  public double getMaxHealth(){
    return this.maxHealth;
  }
  // a method to retrieve the Current Health of an object of type Character
  public double getCurrHealth(){
    return this.currentHealth;
  }
  // a method to retrieve the number of wins of an object of type Character
  public int getNumWins(){
    return this.numOfWins;
  }
  // a method to obtain a string telling the user the character's Name and Current Health
  public String toString(){
    return this.name + "'s current health is " + String.format("%1$.2f", this.currentHealth);
  }
  // a method to calculate the attack damage a character does when they Attack
  // this method uses a randomly generated object with the attack value of a character
  // to give produce an Attack Damage within a certain range
  public double getAttackDamage(int seed){
    Random attackMultiplier = new Random(seed);
    double attackDamage = this.attack*(0.3*attackMultiplier.nextDouble()+0.7);
    return attackDamage;
  }
  // a method to calculate the current health of a character after being inflicted damage 
  // by another character
  public double takeDamage(double attackDamage){
    double newHealth = this.currentHealth - attackDamage;
    this.currentHealth = newHealth;
    return this.currentHealth;
  }
  // a method that increase the number of wins by one (used when a character has won a battle)
  public void increaseWins(){
    numOfWins++;
  }
  // a method used to populate the spells attribute with the same content as the given input both of type ArrayLists
  public static void setSpells(ArrayList<Spell> spellList){
    for(int i=0;i<spellList.size();i++){
      spells.add(spellList.get(i));
    }
  }
  // a method that prints out all the spells contained inside the attribute spells
  // per line
  public static void displaySpells(){
    System.out.println("Here are the available spells:");
    for(int i=0;i<spells.size();i++){
      System.out.println(spells.get(i).toString());
    }
  }
  // a method that calculates the damage done of a given spell with the name as input
  public double castSpell(String name, int seed){
    for(int i=0;i<spells.size();i++){
      if(spells.get(i).getName().equalsIgnoreCase(name)){
        return spells.get(i).getMagicDamage(seed);
      }
    }
    return -1;
  }
}

