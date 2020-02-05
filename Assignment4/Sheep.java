import java.util.Random;
public class Sheep{
  //attributes needed to input into data type Sheep
  private String name;
  private int age;
  private boolean hasWool;
  private static Random numberGenerator = new Random(123);
    
  // initializing the attributes
  public Sheep(String name, int age){
    this.name = name;
    this.age = age;
    this.hasWool = true;
  }
  // the getName() method to return the Sheep name
  public String getName(){
    return this.name;
  }
  // the get Age() method to return the age of the Sheep
  public int getAge(){
    return this.age;
  }
  // the shear method that returns the amount of wool shered from 1 sheep
  public double shear(){
    boolean wool = this.hasWool;
    if(wool){
    double amountOfWool = 6 + 4*numberGenerator.nextDouble();
    this.hasWool = false;
    return amountOfWool;
    }
    else{
      return 0;
    }
  }
}