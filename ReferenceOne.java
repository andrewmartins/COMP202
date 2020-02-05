import java.util.Arrays;
public class ReferenceOne{
  public static void main(String[] args){
  
    int[] x = {1,2,3,4,5};
    System.out.println(Arrays.toString(x));
    // 1 3 5 7 9
    increaseElements(x);
    System.out.println(Arrays.toString(x));
    
  }
  // a void method that takes an int array as input and increases all its
  // elements by their indices
  public static void increaseElements(int[] numbers){
    for(int i=0; i<numbers.length; i++){
      numbers[i] = numbers[i] +i;
    }
  }
}
