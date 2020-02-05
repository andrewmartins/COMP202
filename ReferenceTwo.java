import java.util.Arrays;
public class ReferenceTwo{
  
  public static void main(String[] args){
    int[] x = {1,2,3,4,5};
    System.out.println(Arrays.toString(x));
    swap(x,0,3);
    System.out.println(Arrays.toString(x));
    
    
  }
  // a void method that takes an int array x and two ints i and j as input 
  // the method swaps the element at indec i with the element at index j
  public static void swap(int [] a, int i, int j){
    int temp = i;
    a[i] = a[j];
    a[j] = temp;
    
  }
}
                                        
                                         
                          