public class Farm{
  // the input types to create a Farm data type
  private Sheep[] sheep;
  private Dog dog;
  private String name;
  // the conscrutor that is used to create data type Farm
  public Farm(String name, Dog dog, Sheep[] sheep){
    this.name = name;
    this.dog = dog;
    Sheep[] sheepCopy = new Sheep[sheep.length];
    for(int i=0;i<sheepCopy.length;i++){
      sheepCopy[i] = sheep[i];
    }
    this.sheep = sheepCopy;
    if(sheep.length>dog.herd()){
      throw new IllegalArgumentException("Maximum number of sheep for this dog is " + dog.herd() + ". Recieved" + sheep.length + " sheep.");
    }
  }
  // the getName() method that returns the name of the Farm
  public String getName(){
    return this.name;
  }
  // the getNumSheep() that returns the number of sheep in the farm
  public int getNumSheep(){
    return this.sheep.length;
  }
  // the printFarm() method prints all the aspects of the farm (name and age of each sheep, name of farm, and name of dog)
  public void printFarm(){
    System.out.println(getName());
    System.out.println(dog.getName());
    for(int i=0;i<sheep.length;i++){
    System.out.print(sheep[i].getName());
    System.out.print(" ");
    System.out.print(sheep[i].getAge());
    System.out.println();
    }
  }
  // the getWool() calls the shear method on each sheep to get the total amount of wool in the farm
  public double getWool(){
    double totalWool = 0;
    for(int i=0;i<sheep.length;i++){
      totalWool+=sheep[i].shear();
      
    }
    return totalWool;
  }
    
}
 
