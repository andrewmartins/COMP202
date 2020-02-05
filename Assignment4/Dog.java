public class Dog{
  private String name;
  private String breed;
  public static void main(String[] args){
  }
  // initializing the attributes of the data type Dog
  public Dog(String name, String breed){
    this.name = name;
    this.breed = breed;
  }
  // the getName() method for type Dog
  public String getName(){
    return this.name;
  }
  // the herd() method returns the number of sheep a breed of dog can herd
  public int herd(){
    String dogBreed = this.breed.toLowerCase();
    if(dogBreed.contains("collie")){
      return 20;
    }
    if(dogBreed.contains("shephard")){
      return 25;
    }
    if(dogBreed.contains("kelpies")||dogBreed.contains("tervens")){
      return 30;
    }
    else{
      return 10;
    } 
  }
}
    
    