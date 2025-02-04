public class ArraysThree{
  public static void main(String[] args){
    
  }
  
  //write a method that takes an array of ints as input
  // and returns the smallest element in the array
  /* 
   * getSmallest({3, -5, 9, 11}) --> -5
   * getSmallest({4,5,6,7,-15})--> -15
   * getSmallest({}) --> throw an Exception
   */
  public static int getSmallest (int[] arr){
    // input validation
    if(arr.length<1){
      throw new IllegalArgumentException("There are no elements");
    }
    
        
    // IDEA: assum it is the first one
    int min = arr[0];
    
    // iterate through the elements to see if the 
    // assumption should be updated
    
    for(int i = 0; i<arr.length; i++){
      if(arr[i]<arr[i+1]){
        min = arr[i];
      }
    }
    return min;
    
  }
}
  