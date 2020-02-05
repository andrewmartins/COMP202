
public class ArrayOne{
  public static void main(String[] args){
    double [] num = getRandomNumbers(5);
    for(int i=0; i<num.length; i++){
    System.out.println(num[i]);
    }
  }
  
  // a method that takes an integer n as input
  // and returns an array with n elements that are 
  // random doubles between 0 and 1
  
  public static double[] getRandomNumbers(int n){
    // 1) create an array of size n 
    
    double[] numbers = new double[n];
      
    // 2) populate it (initialize its elements)
    
    for(int i=0; i<numbers.length; i++){
      // i refers to an index of the array 
      // numbers[i] is the element at index i
      numbers[i] = Math.random();
    }
    
    // 3) return it
    return numbers;
  }
  
}