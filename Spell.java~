import java.util.Random;
public class Spell{
  // initializing the attributes of the class Spell
  private String name;
  private double minDamage;
  private double maxDamage;
  private double chance;
  // a constructor used to make objects of type Spell, ensuring that "minDamage" is less than "maxDamage"
  // and that chance is not greater than 1 or less than 0
  public Spell(String name,double minDamage,double maxDamage,double chance){
    if(minDamage<0 || minDamage>maxDamage){
      throw new IllegalArgumentException("Improper input for minimum damage");
    }
    if(chance>1||chance<0){
      throw new IllegalArgumentException("Improper input for chance of success");
    }
    else{
      this.name = name;
      this.minDamage = minDamage;
      this.maxDamage = maxDamage;
      this.chance = chance;
    }
  }
  // a method to retrieve the name of the spell
  public String getName(){
    return this.name;
  }
  // a method that calculates the damage a spell does based on its max and min values
  public double getMagicDamage(int seed){
    Random randomObject = new Random(seed);
    if(randomObject.nextDouble()>chance){
      return 0;
    }
    else{
      return (this.maxDamage-this.minDamage)*randomObject.nextDouble()+this.minDamage;
    }
  }
  // a method to convert information about the spell into a String 
  public String toString(){
    double percentChance =  chance*100;
    String percent = String.format("%1$.1f", percentChance);
    String s = "Name: " + this.name + " Damage: " + this.minDamage + "-"+ this.maxDamage + " Chance: " + percent + "%";
    return s;
  }
}
      
      
    
    