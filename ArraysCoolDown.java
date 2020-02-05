public class ArraysCoolDown{
    public static void main(String[] args){
      int[] a = {1,2,5};
      int[] b = {1,2,3};
      System.out.println(areEqual(a,b));
    
  }
  
  // a method that takes two int arrays as input and returns
  // true if the two arrays contain the same elements
  // false otherwise
  /*
   * areEqual({1,2,3},{1,2,3}) --> true
   * areEqual({1,2,5},{1,2,6}) --> false
   * areEqual({1,2,3},{3,2,1}) --> false
   * areEqual({1,2,3},{1,2,3,4,5}) --> false
   */
  public static boolean areEqual(int[] x, int[] y){
    if(x.length != y.length){
      return false;
    }
    for(int i =0; i<x.length; i++){
      if(x[i] != y[i]){
        return false;
      }
    }
    return true;
  }
        
    
  }
 
  