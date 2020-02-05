import java.util.Random;
public class RandomNumbers{
  public static void main(String[] args){
    getRandomNumbers();
    getRandomNumbersWithSeed();
    
  }
  
  public static void getRandomNumbersWithSeed(){
    Random gen = new Random(123);
    // This generates a random int between 0 and 50 gen.nextInt(50);
    for(int i = 0; i<10; i++){
      System.out.print(gen.nextInt(50) + " ");
    }
    System.out.println();
    
  }
  
  
  // a method that creates an object of type Random using no seed
  // the method displays 10 random integers between 0 and 50
  
  public static void getRandomNumbers(){
    Random gen = new Random();
    // This generates a random int between 0 and 50 gen.nextInt(50);
    for(int i = 0; i<10; i++){
      System.out.print(gen.nextInt(50) + " ");
    }
    System.out.println();
    
  }
  
  
}